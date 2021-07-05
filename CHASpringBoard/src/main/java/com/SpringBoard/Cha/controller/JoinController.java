package com.SpringBoard.Cha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SpringBoard.Cha.dto.User;

@Controller
public class JoinController {
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
			return "join_form";
	}

	@RequestMapping(value="/join", method =RequestMethod.POST)
	public String join(@ModelAttribute User user, Model model) {
		return "join_display";
	}

}
