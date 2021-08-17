package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.dto.UserDTO;

@Controller
public class TestController {

	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/input_data")
	public String input_data() {
		return "input_data";
	}
	
	@GetMapping("/read_data")
	public String read_data() {
		return "read_data";
	}
	
	
	
	
	
	
	
	@GetMapping("/login")
	public String login() {
		return "login/login_form";
	}
	
	@PostMapping("/login")
	public String login2() {
		return "result";
	}
	
	@GetMapping("/register_form")
	public String register() {
		return "register_form";
	}
	
	@PostMapping("/register")
	public String register2() {
		return "result";
	}
	
	
	
}
