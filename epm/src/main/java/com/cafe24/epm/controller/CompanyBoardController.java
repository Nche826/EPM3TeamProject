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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.epm.domain.CompanyBoardComment;
import com.cafe24.epm.domain.CompanyBoardContent;
import com.cafe24.epm.service.CompanyBoardService;
import com.cafe24.epm.service.StorageService;

@Controller
public class CompanyBoardController {
	
	@Autowired private CompanyBoardService companyBoardService;
	@Autowired private StorageService storageService;
	
	
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
	
	//게시물 수정 화면
	@GetMapping("/companyUpdateContents")
	public String companyUpdateContents () {
		return "company/companyUpdateContents";
	}
	
	//게시물 삭제
	@GetMapping("/companyDeleteContents")
	public String companyDeleteContents () {
		return "redirect:/companyListContents";
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
	
	//댓글 삭제
	@GetMapping("/companyDeleteComment")
	public String companyDeleteComment () {
		return "company/companyContents";
	}
}
