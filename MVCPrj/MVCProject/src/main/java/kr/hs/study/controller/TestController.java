package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.model.dto.UserDTO;

@Controller
public class TestController {

	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/gugudan")
	public String gugudanForm() {
		return "gugudan_form";
	}
	
	@PostMapping("/gugudan")
	public String gugudan(Model model, @RequestParam int dan) {

		model.addAttribute("number", dan);
		
		return "gugudan_result";
	}
	

	@GetMapping("/sum")
	public String sumForm() {
		return "sum_form";
	}
	
	@PostMapping("/sum")
	public String sum(Model model, @RequestParam int n, @RequestParam int m) {
		
		model.addAttribute("n", n);
		model.addAttribute("m", m);
		
		return "sum_result";
	}
	

	@GetMapping("/member")
	public String memberForm() {
		return "member_form";
	}

	@PostMapping("/member")
	public String member() {
		return "member_result";
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
