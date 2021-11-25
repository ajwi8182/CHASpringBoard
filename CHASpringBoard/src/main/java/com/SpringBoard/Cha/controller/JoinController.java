package com.SpringBoard.Cha.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringBoard.Cha.dto.Saram;
import com.SpringBoard.Cha.exception.SaraminfoNotFoundException;
import com.SpringBoard.Cha.service.SaramService;

@Controller
@RequestMapping("/join")
public class JoinController {
	@Autowired
	private SaramService saramService;

	// ȸ������
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "join_form";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(@ModelAttribute Saram saram) {
		saramService.addSaram(saram);
		return "redirect:/join/login"; //ȸ�������ص� ȸ����Ͽ� �߰� �ȵƾ��µ� �̺κ� ���ļ� �ذ�11/24
	}

	// �α���
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login_form";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute Saram saram, Model model ,HttpSession session) 
			throws SaraminfoNotFoundException {

		// ���� �̹߻� : �������� - HttpSession ��ü�� ���� ���� ���� ����
		session.setAttribute("loginSaraminfo", saramService.getSaraminfo(saram.getId()));
		model.addAttribute("saramList", saramService.getSaramList());
		//return "board/boardMain";
		return "list_Saram";
		
	}
	//�α׾ƿ�
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}
	
	// �α��� ����ڸ� ���۵ǵ��� ���ͼ��� ���
	@RequestMapping("/list_saram")
	public String list(Model model) {
		model.addAttribute("loginUserinfoList", saramService.getSaramList());
		return "list_Saram";
	}
	/*
	 * id�� �����ͼ� �ش� id�� Saram ������
	@RequestMapping("/view")
	public String view(@RequestParam String id, Model model) {
		model.addAttribute("saraminfo", saramService.getSaraminfo(id));
		return "saram_detail";
	} 
	*/
	/*
	 * Saram ���� ����
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	String modify(@RequestParam String id, Model model) {
		model.addAttribute("saraminfo", saramService.getSaraminfo(id));
		return "saram_modify";
	}
	@RequestMapping(value="/modify", method = RequestMethod.POST)
	public String modify(@ModelAttribute Saram saram, HttpSession session ) {
		saramService.modifySaraminfo(saraminfo);
			//����ȸ���� ���� �α��� ������� ��쿡 ���ǿ� ����� ���� ���� ���� ����
		return "redirect:";
	}
	*/
	/*
	//Saram ����
	public String remove(@RequestParam String id, HttpSession session) {
		saramService.removeSaram(id);
		
		//����ȸ���� ���� �α��� ������� ���
		
		return "redirect:/";
	}
	*/
	
	@RequestMapping(value = "/board_write")
	public String saramList(Model model, Saram saram) {
		return "board/writePostForm";
	}
}
