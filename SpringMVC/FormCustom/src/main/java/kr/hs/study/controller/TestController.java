package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.hs.study.model.dto.UserDTO;

@Controller
public class TestController {

	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/test1")
	public String register(UserDTO dto) {
		
		dto.setName("kim");
		dto.setId("kim_id");
		dto.setPw("1111");
		dto.setEmail("kim@gmail.com");
		dto.setAddress("seoul");
		dto.setAddress_detail("kwanak 353");
		
		return "test1";
	}
	
	@PostMapping("/register")
	public String test1(Model model, UserDTO dto) {
		
		model.addAttribute("name", dto.getName());
		model.addAttribute("id", dto.getId());
		model.addAttribute("pw", dto.getPw());
		model.addAttribute("email", dto.getEmail());
		model.addAttribute("address", dto.getAddress());
		model.addAttribute("address_detail", dto.getAddress_detail());
		
		return "test1_result";
	}

	
	@GetMapping("/test2")
	public String register2(UserDTO dto) {
		
		dto.setName("lee");
		dto.setId("lee_id");
		dto.setPw("1111");
		dto.setEmail("lee@gmail.com");
		dto.setAddress("seoul");
		dto.setAddress_detail("kwanak 353");
		
		return "test2";
	}
	
	@PostMapping("/test2_result")
	public String test2_result(Model model, UserDTO dto) {
		
		model.addAttribute("name", dto.getName());
		model.addAttribute("id", dto.getId());
		model.addAttribute("pw", dto.getPw());
		model.addAttribute("email", dto.getEmail());
		model.addAttribute("address", dto.getAddress());
		model.addAttribute("address_detail", dto.getAddress_detail());
		
		return "test2_result";
	}

	
	@GetMapping("/test3")
	public String register3(@ModelAttribute("user") UserDTO dto) {
		
		dto.setName("lee");
		dto.setId("lee_id");
		dto.setPw("1111");
		dto.setEmail("lee@gmail.com");
		dto.setAddress("seoul");
		dto.setAddress_detail("kwanak 353");
		
		return "test3";
	}
	
	@PostMapping("/test3_result")
	public String test3_result(Model model, UserDTO dto) {
		
		model.addAttribute("name", dto.getName());
		model.addAttribute("id", dto.getId());
		model.addAttribute("pw", dto.getPw());
		model.addAttribute("email", dto.getEmail());
		model.addAttribute("address", dto.getAddress());
		model.addAttribute("address_detail", dto.getAddress_detail());
		
		return "test3_result";
	}
}
