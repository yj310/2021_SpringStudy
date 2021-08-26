package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.model.dto.MemberDTO;

@Controller
public class TestController {

	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/gugudan")
	public String gugudanForm() {
		return "gugudan/gugudan_form";
	}
	
	@PostMapping("/gugudan")
	public String gugudan(Model model, @RequestParam int dan) {

		model.addAttribute("number", dan);
		
		return "gugudan/gugudan_result";
	}
	

	@GetMapping("/sum")
	public String sumForm() {
		return "sum/sum_form";
	}
	
	@PostMapping("/sum")
	public String sum(Model model, @RequestParam int n, @RequestParam int m) {
		
		model.addAttribute("n", n);
		model.addAttribute("m", m);
		
		return "sum/sum_result";
	}
	
	
	
	
	
	
	
	
}
