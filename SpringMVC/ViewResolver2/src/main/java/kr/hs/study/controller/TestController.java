package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.hs.study.model.dto.AbcDTO;
import kr.hs.study.model.dto.UserDTO;

@Controller
public class TestController {

	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/test1")
	public String test1() {
		
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(Model model) {
		model.addAttribute("id", "kim");
		model.addAttribute("password", "1111");
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3() {
		return "login/login_form";
	}
	
	@PostMapping("/login")
	public String login(Model model, UserDTO user) {
		
		model.addAttribute("id", user.getId());
		model.addAttribute("pw", user.getPw());
		model.addAttribute("email", user.getEmail());
		
		return "test3";
	}
	
	@GetMapping("/test4")
	public ModelAndView test4(ModelAndView mv) {
		mv.addObject("id", "lee");
		mv.addObject("pw", "1111");
		mv.addObject("email", "lee@gmail.com");
		
		// view 이름까지 지정해줘야 함
		mv.setViewName("test4");
		
		return mv;
	}
	
	// 객체에 담긴 값을 model에 담아서 view로 넘김
	@GetMapping("/test5")
	public String test5(Model model, AbcDTO dto) {	// 자동으로 AbcDTO dto = new AbcDTO();
		model.addAttribute("a", dto.getA());
		model.addAttribute("b", dto.getB());
		model.addAttribute("c", dto.getC());
		return "test5";
	}
	
	// 객체에 담긴 값을 바로 view로 넘김
	@GetMapping("/test6")
	public String test6(@ModelAttribute AbcDTO dto) {	
		return "test6";
	}
	
	@GetMapping("/test7")
	public String test7(@ModelAttribute("sample") AbcDTO dto) {	
		return "test7";
	}
}
