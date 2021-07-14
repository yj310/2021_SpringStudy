package kr.hs.study.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.dto.MamberDTO;

@Controller
public class TestController {

	
	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/join")
	public String join() {
		return "account/join_form";
	}
	
	@GetMapping("/login")
	public String login() {
		return "account/login_form";
	}
	
	@PostMapping("/login")
	public String login2(MamberDTO dto, Model model) {
		model.addAttribute("result", dto);
		return "account/login_result";
	}
}
