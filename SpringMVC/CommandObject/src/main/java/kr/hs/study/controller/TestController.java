package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.LoginDTO;
import kr.hs.study.model.ModelDTO;

@Controller
public class TestController {

	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/test1")
	public String test1(ModelDTO dto) {			// @ModelAttribute ModelDTO dto => ModelDTO dto = new ModelDTO();
		
		System.out.println(dto.getA());
		System.out.println(dto.getB());
		System.out.println(dto.getC());
		
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2() {
		
		return "/login/login_form";
	}
	
	@PostMapping("/login")
	public String test3(LoginDTO dto) {
		
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(ModelDTO dto) {	
		
		System.out.println(dto.getA());
		System.out.println(dto.getB());
		
		return "result";
	}
	
}
