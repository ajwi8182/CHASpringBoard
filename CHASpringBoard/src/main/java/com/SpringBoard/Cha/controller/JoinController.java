package com.SpringBoard.Cha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SpringBoard.Cha.dto.Saram;
import com.SpringBoard.Cha.service.SaramService;

@Controller
@RequestMapping("/saraminfo")
public class JoinController {
	@Autowired
	private SaramService saraminfoService;
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
			return "join_form";
	}

	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(@ModelAttribute Saram saram) {
		return "join_display";
	}
	
}
