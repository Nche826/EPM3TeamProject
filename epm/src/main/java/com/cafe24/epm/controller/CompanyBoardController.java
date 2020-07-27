package com.cafe24.epm.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.cafe24.epm.domain.CompanyBoardComment;
import com.cafe24.epm.domain.CompanyBoardContent;
import com.cafe24.epm.service.CompanyBoardService;
import com.cafe24.epm.service.StorageService;

@Controller
public class CompanyBoardController {
	
	@Autowired private CompanyBoardService companyBoardService;
	@Autowired private StorageService storageService;
	
	//게시물 검색
	@GetMapping("/companyBoardSearch")
	public String companyBoardSearch (Model model, @RequestParam(name = "searchD1",required = false) String searchD1
												 , @RequestParam(name = "searchD2",required = false) String searchD2
												 , @RequestParam(name = "searchK",required = false) String searchK
												 , @RequestParam(name = "searchV",required = false) String searchV) {
		System.out.println("searchD1,searchD2,searchK,searchV : " + searchD1+searchD2+searchK+searchV);
		List<CompanyBoardContent> companyBoardList = companyBoardService.companyBoardSearch(searchD1,searchD2,searchK,searchV);
		model.addAttribute("companyBoardContentList",companyBoardList);		
		return "company/companyListContents";
	}
	
	//게시물 리스트
	@GetMapping("/companyListContents")
	public String companyListContents (Model model) {
		System.out.println("==========게시물 리스트==========");
		List<CompanyBoardContent> companyBoardContentList = companyBoardService.companyBoardList();
		model.addAttribute("companyBoardContentList",companyBoardContentList);
		return "company/companyListContents";
	}
	
	//게시물 상세 화면
	@GetMapping("/companyContents")
	public String companyContents (@RequestParam(name = "company_code", required = false) String companyCode, Model model) {
		System.out.println("companyCode>>>" + companyCode);
		CompanyBoardContent companyBoardContentSelect = companyBoardService.companyBoardSelect(companyCode);
		List<CompanyBoardComment> companyBoardCommentList = companyBoardService.companyCommentList(companyCode);
		//조회수 업데이트
		companyBoardService.companyBoardCountUpadate(companyCode);
		
		model.addAttribute("companyBoardCommentList",companyBoardCommentList);
		model.addAttribute("companyBoardContentSelect",companyBoardContentSelect);
		return "company/companyContents";
	}
	
	//게시물 첨부파일 다운로드
	@GetMapping("/fileupload/{filename:.+}")
	@ResponseBody
	public ResponseEntity<Resource> companyFileDown (@PathVariable String filename) throws IOException{
		Resource file = storageService.loadAsResource(filename);
		ResponseEntity<Resource>  re = ResponseEntity.ok().header(
		HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"").body(file);
	 	return re; 
	  }
	 

	//게시물 등록 화면
	@GetMapping("/companyInsertContents")
	public String companyInsertContents () {
		return "company/companyInsertContents";
	}
	
	//게시물 등록
	@PostMapping("/companyInsertContents")
	public String companyInsertContents (CompanyBoardContent companyBoardContent, @RequestParam(value = "file") MultipartFile file) throws IOException {
		System.out.println("=======파일업로드=======");
		storageService.store(file);
		System.out.println(file+"::::::file");
		System.out.println("=======게시물등록=======");
		companyBoardContent.setCompanyFile(file.getOriginalFilename());
		System.out.println(file.getOriginalFilename()+"::::::file.getOriginalFilename()");
		companyBoardService.companyBoardInsert(companyBoardContent);
		return "redirect:/companyListContents";
	}
	
	//게시물 수정 화면
	@GetMapping("/companyUpdateContents")
	public String companyUpdateContents (@RequestParam(name = "company_code", required = false) String companyCode, Model model) {
		CompanyBoardContent companyBoardContentSelect = companyBoardService.companyBoardSelect(companyCode);
		model.addAttribute("companyBoardContentSelect",companyBoardContentSelect);
		return "company/companyUpdateContents";
	}
	
	//게시물 수정 처리
	@PostMapping("/companyUpdateContents")
	public String companyUpdateContents (CompanyBoardContent companyBoardContent
										, @RequestParam(value = "file", required = false) MultipartFile file) throws IOException {
		System.out.println("=======파일업로드=======");
		storageService.store(file);
		System.out.println(file+"::::::file");
		System.out.println("=======게시물등록=======");
		System.out.println(file.getOriginalFilename()+"::::::file.getOriginalFilename()");
		companyBoardContent.setCompanyFile(file.getOriginalFilename());
		System.out.println(companyBoardContent+"<<< CompanyBoardContent");
		companyBoardService.companyBoardUpadate(companyBoardContent);
		String companyCode = companyBoardContent.getCompanyCode();
		return "redirect:/companyContents?company_code="+companyCode;
	}
	
	//게시물 삭제
	@GetMapping("/companyDeleteContents")
	public String companyDeleteContents (@RequestParam ( name = "company_code", required = false) String companyCode) {
		//삭제할 게시물의 댓글 삭제
		List<CompanyBoardComment> commentList = companyBoardService.companyCommentSelectByCode(companyCode);
		for ( int i = 0; i < commentList.size(); i++ ) {
			companyBoardService.companyCommentDelete(commentList.get(i).getCompanyCCode());
		}
		//게시물 삭제
		companyBoardService.companyBoardDelete(companyCode);
		return "redirect:/companyListContents";
	}
	
	//댓글 등록
	@PostMapping("/companyInsertComment")
	public String companyInsertComment (CompanyBoardComment companyBoardComment) {
		companyBoardService.companyCommentInsert(companyBoardComment);
		String companyCode = companyBoardComment.getCompanyCode();
		return "redirect:/companyContents?company_code="+companyCode;
	}
	
	//댓글 목록
	@GetMapping("/companyComment")
	public String companyComment (@RequestParam(name = "company_code", required = false) String companyCode, Model model) {
		List<CompanyBoardComment> companyBoardCommentList = companyBoardService.companyCommentList(companyCode);
		model.addAttribute("companyBoardCommentList",companyBoardCommentList);
		return "company/companyComment";
	}
	
	//댓글 수정
	@GetMapping("/companyUpdateComment")
	public String companyUpdateComment () {
		return "company/companyContents";
	}
	
	//댓글 수정
	@PostMapping(value = "/companyCommentUpdate", produces = "application/json")
	@ResponseBody
	public CompanyBoardComment companyUpdateComment (CompanyBoardComment companyBoardComment) {
		companyBoardService.companyCommentUpdate(companyBoardComment);
		System.out.println("companyBoardComment : "+companyBoardComment);
		return companyBoardService.companyCommentSelectByCCode(companyBoardComment);
	}
	
	//댓글 삭제
	@GetMapping("/companyDeleteComment")
	public String companyDeleteComment (@RequestParam(name= "company_c_code", required = false) String companyCCode) {
		CompanyBoardComment companyBoardComment = new CompanyBoardComment();
		companyBoardComment.setCompanyCCode(companyCCode);
		companyBoardComment = companyBoardService.companyCommentSelectByCCode(companyBoardComment);
		String companyCode = companyBoardComment.getCompanyCode();;
		companyBoardService.companyCommentDelete(companyCCode);
		return "redirect:/companyContents?company_code="+companyCode;
	}
}
