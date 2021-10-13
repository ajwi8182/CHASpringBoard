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
	
	//�Խñ� �ۼ�
	@RequestMapping(value = "/addPost", method = RequestMethod.GET)
	public String addPost() {
		return "board/bWriteForm";
	}
	
	//�Խñ� �ۼ�
	@RequestMapping(value = "/addPost", method = RequestMethod.POST)
	public String addPost(@ModelAttribute SJBoard sjBoard, Model model) {
		sjBoardService.addSJBoard(sjBoard);
		return "redirect:/board/display";
	}
	
	//�Խñ� ���
	@RequestMapping("/display")
	public String display(Model model) {
		model.addAttribute("sjBoardList", sjBoardService.getSJBoardList());
		return "board/bMain";
	}
	
	//�Խù� �󼼺���
	@RequestMapping(value="/postDetail")
	public String view(@RequestParam int boardPostNum, Model model) throws SaraminfoNotFoundException{
		model.addAttribute("sjBoard", sjBoardService.getBoardPost(boardPostNum));
		return "board/bPostDetail";
	}
	/*
	@RequestMapping("/postDelete/{boardSubject}")
	public String postDelete(@PathVariable String boardSubject) {
		
		//sjboard ���̺� ����� �Խñ� ����
		sjBoardService.removeBoardPost(boardSubject);
		return "redirect:/board/display";
	}
	*/
	@RequestMapping("/postDelete") 
	public String postDelte(@RequestParam int boardPostNum, HttpSession session) {
		sjBoardService.removeBoardPost(boardPostNum);
		return "redirect:/board/display"; /*=> �̷��� �����ϰ� , ������ư ������ /display�� �Ѿ����*/
	}
	
}