package com.cafe24.epm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe24.epm.domain.Member;
import com.cafe24.epm.domain.Staff;
import com.cafe24.epm.mapper.MemberMapper;
import com.cafe24.epm.service.MemberService;
import com.cafe24.epm.service.StorageService;

@Controller
public class MemberController {
	@Autowired private MemberService memberService;
	@Autowired private MemberMapper memberMapper;
	
	@GetMapping("/memberSearch")
	public String memberSearch(Model model, @RequestParam(name = "searchD1",required = false) String searchD1
										  , @RequestParam(name = "searchD2",required = false) String searchD2
										  , @RequestParam(name = "searchK",required = false) String searchK
										  , @RequestParam(name = "searchV",required = false) String searchV) {
		System.out.println("searchD1,searchD2,searchK,searchV : "+searchD1+searchD2+searchK+searchV);
		List<Member> memberList = memberService.memberSearch(searchD1,searchD2,searchK,searchV);		
		model.addAttribute("memberList",memberList);
		return "member/memberList";
	}
	
	@GetMapping("/memberInsert")
	public String memberInsertView() {
		return "member/memberInsert";
	}
	
	@PostMapping("/memberInsert")
	public String memberInsert(Member member) throws IOException {
		System.out.println("=======회원가입=======");
		System.out.println("member : " + member);
		memberService.memberInsert(member);
		return "redirect:/memberList";
	}
	
	
	
	@PostMapping("/memberDeleteConfirm")
	public String memberDeleteConfirm (HttpSession session, Model model) {
		Member member = (Member) model.getAttribute("member");
		Member result = memberMapper.memberSelect(member.getMemberId());
		//1단계 : 로그인한 아이디와  memberId가 일치하는지 조회
		if(result.equals(session.getAttribute("S_ID"))){
			//2단계 : 조회된 정보의 pw와 입력된 pw 일치 여부
			if(!"".equals(member.getMemberPw())){
				if(result.getMemberPw().equals(member.getMemberPw())) {
					//pw 일치 시 삭제처리
					memberService.memberDelete(member);				
				}
			}
		}
		return "redirect:/memberList";
	}
		
	@GetMapping("/memberDeleteConfirm")
	public String memberDeleteConfirmView (HttpSession session, Model model) {
		System.out.println("getMapping /memberDeleteConfirm ");
		return "member/memberDeleteConfirm";
	}	
	
	@GetMapping("/memberDelete")
	public String memberDelete(@RequestParam("member_id") String member_id, HttpSession session, Model model ) {
		System.out.println("@GetMapping(\"/memberDelete\")");
		Member member = memberService.memberSelect(member_id);
		//권한이 관리자, 대표일 경우 삭제 후 리스트 화면으로 이동
		if("관리자".equals(session.getAttribute("S_LEVEL")) || "대표".equals(session.getAttribute("S_LEVEL")) ) {
			memberService.memberDelete(member);
			System.out.println("권한이 관리자, 대표일 경우 삭제 후 리스트 화면으로 이동");
			return"redirect:/memberList";
		//로그인 ID와 삭제할 ID가 같으면 모델객체에 member객체를 담아 삭제확인 화면으로 이동
		}else if(member_id.equals(session.getAttribute("S_ID"))){
			System.out.println("로그인한 아이디와  memberId가 일치하는지 조회 : "+member);
			model.addAttribute("member", member);
			System.out.println("로그인 ID와 삭제할 ID가 같으면 모델객체에 member객체를 담아 삭제확인 화면으로 이동");
			return"member/memberDeleteConfirm";
		}
		return"redirect:/memberList";
	}
	
	@PostMapping("/memberUpdate")
	public String memberUpdate(Member member) {
		memberService.memberUpdate(member);
		return"member/memberUpdate";
	}
	
	@GetMapping("/memberUpdate")
	public String memberUpdate( @RequestParam(name = "member_id", required = false) String memberId, Model model) {
		System.out.println("memberId>>" + memberId);
		Member member = memberService.memberSelect(memberId);
		model.addAttribute("member", member);
		return"member/memberUpdate";
	}
	
	//개인 수정 화면 비밀번호 확인 후 수정화면으로 이동
	@PostMapping("/memberUpdateConfirm")
	public String memberUpdateConfirm(Member member,  HttpSession session, RedirectAttributes redirectAttr) {
		//1단계 : 로그인한 아이디와  memberId가 일치하는지 조회
		Member result = memberMapper.memberSelect((String)session.getAttribute("SID"));
		System.out.println("로그인한 아이디와  memberId가 일치하는지 조회 : "+result);
		//2단계 : 조회된 정보의 pw와 입력된 pw 일치 여부
		if(!"".equals(member.getMemberPw())){
			if(result.getMemberPw().equals(member.getMemberPw())) {
				//pw 일치 시 진짜 수정화면으로 이동 
				return "member/memberUpdate"; 
			}
		}
		//pw 일치하지 않을 경우 비밀번호 확인 화면으로 이동하고 메세지 띄움 
		System.out.println("=====수정화면이동실패 : 비밀번호 오류=====");
		redirectAttr.addAttribute("message","비밀번호가 일치하지 않습니다.");
		return"redirect:/memberUpdateConfirm";
	}
	
	@GetMapping("/memberUpdateConfirm")
	public String memberUpdateConfirmView(HttpSession session, RedirectAttributes redirectAttr, @RequestParam(name="member_id", required = false)String member_id) {
		//세션에 등록된 권한이 관리자, 대표일 경우 비밀번호 확인 없이 수정화면으로 이동.
		System.out.println(session.getAttribute("SSTAFF")+"<< SSTAFF");
		List<Staff> staff = (List<Staff>) session.getAttribute("SSTAFF");
		System.out.println(member_id+"member_id:::::::::::::::::::::::");
		for(int i = 0; i < staff.size() ;i++ ) {
			if("관리자".equals(staff.get(i).getLevel_name()) || "대표".equals(staff.get(i).getLevel_name()) ) {
				return "redirect:/memberUpdate?member_id="+member_id; 
			}
		  }
		//세션에 등록된 권한이 관리자, 대표가 아닐 경우 리스트로 돌아가 메세지 출력 
		System.out.println("=====수정화면이동실패 : 권한 없음=====");
		redirectAttr.addAttribute("message","권한이 없습니다.");
		return"redirect:/memberList";
	}
		
	@GetMapping("/memberList")
	public String memberList(Model model) {
		System.out.println("=====MemberController memberList=====");
		List<Member> memberList = memberService.memberList();
		System.out.println("memberList : "+memberList);
		model.addAttribute("memberList",memberList);
		return"member/memberList";
	}
	
	@PostMapping(value = "/memberSelect", produces = "application/json")
	@ResponseBody
	public Member memberSelect(String memberId) {
		return memberService.memberSelect(memberId);
	}
}
