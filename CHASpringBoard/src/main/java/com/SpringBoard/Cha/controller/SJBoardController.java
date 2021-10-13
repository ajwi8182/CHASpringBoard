package com.SpringBoard.Cha.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringBoard.Cha.dto.SJBoard;
import com.SpringBoard.Cha.exception.SaraminfoNotFoundException;
import com.SpringBoard.Cha.service.SJBoardService;

@Controller
@RequestMapping("/board")
public class SJBoardController {
	@Autowired
	private SJBoardService sjBoardService;
	
	//게시글 작성
	@RequestMapping(value = "/addPost", method = RequestMethod.GET)
	public String addPost() {
		return "board/bWriteForm";
	}
	
	//게시글 작성
	@RequestMapping(value = "/addPost", method = RequestMethod.POST)
	public String addPost(@ModelAttribute SJBoard sjBoard, Model model) {
		sjBoardService.addSJBoard(sjBoard);
		return "redirect:/board/display";
	}
	
	//게시글 목록
	@RequestMapping("/display")
	public String display(Model model) {
		model.addAttribute("sjBoardList", sjBoardService.getSJBoardList());
		return "board/bMain";
	}
	
	//게시물 상세보기
	@RequestMapping(value="/postDetail")
	public String view(@RequestParam int boardPostNum, Model model) throws SaraminfoNotFoundException{
		model.addAttribute("sjBoard", sjBoardService.getBoardPost(boardPostNum));
		return "board/bPostDetail";
	}
	/*
	@RequestMapping("/postDelete/{boardSubject}")
	public String postDelete(@PathVariable String boardSubject) {
		
		//sjboard 테이블에 저장된 게시글 삭제
		sjBoardService.removeBoardPost(boardSubject);
		return "redirect:/board/display";
	}
	*/
	@RequestMapping("/postDelete") 
	public String postDelte(@RequestParam int boardPostNum, HttpSession session) {
		sjBoardService.removeBoardPost(boardPostNum);
		return "redirect:/board/display"; /*=> 이렇게 수정하고 , 삭제버튼 누르고 /display로 넘어가긴함*/
	}
	
}