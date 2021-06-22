package kr.hs.study.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.dto.LoginDTO;

@Controller
public class TestController {

	@Autowired
	SqlSessionTemplate sqlsessiontemplate;
	
	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login/login_form";
	}
	
	@PostMapping("/login")
	public String login_result(Model model, LoginDTO dto) {
		model.addAttribute("result", dto);
		sqlsessiontemplate.insert("login.insert", dto);
		return "login/result";
	}
	
}
