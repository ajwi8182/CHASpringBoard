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

	// 회원가입
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "join_form";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(@ModelAttribute Saram saram) {
		saramService.addSaram(saram);
		return "redirect:/join/login"; //회원가입해도 회원목록에 추가 안됐었는데 이부분 고쳐서 해결11/24
	}

	// 로그인
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login_form";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute Saram saram, Model model ,HttpSession session) 
			throws SaraminfoNotFoundException {

		// 예외 미발생 : 인증성공 - HttpSession 객체에 권한 관련 정보 저장
		session.setAttribute("loginSaraminfo", saramService.getSaraminfo(saram.getId()));
		model.addAttribute("saramList", saramService.getSaramList());
		//return "board/boardMain";
		return "list_Saram";
		
	}
	//로그아웃
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}
	
	// 로그인 사용자만 동작되도록 인터셉터 사용
	@RequestMapping("/list_saram")
	public String list(Model model) {
		model.addAttribute("loginUserinfoList", saramService.getSaramList());
		return "list_Saram";
	}
	/*
	 * id를 가져와서 해당 id의 Saram 상세정보
	@RequestMapping("/view")
	public String view(@RequestParam String id, Model model) {
		model.addAttribute("saraminfo", saramService.getSaraminfo(id));
		return "saram_detail";
	} 
	*/
	/*
	 * Saram 정보 수정
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	String modify(@RequestParam String id, Model model) {
		model.addAttribute("saraminfo", saramService.getSaraminfo(id));
		return "saram_modify";
	}
	@RequestMapping(value="/modify", method = RequestMethod.POST)
	public String modify(@ModelAttribute Saram saram, HttpSession session ) {
		saramService.modifySaraminfo(saraminfo);
			//변경회원이 현재 로그인 사용자인 경우에 세션에 저장된 권한 관련 정보 변경
		return "redirect:";
	}
	*/
	/*
	//Saram 삭제
	public String remove(@RequestParam String id, HttpSession session) {
		saramService.removeSaram(id);
		
		//삭제회원이 현재 로그인 사용자인 경우
		
		return "redirect:/";
	}
	*/
	
	@RequestMapping(value = "/board_write")
	public String saramList(Model model, Saram saram) {
		return "board/writePostForm";
	}
}
