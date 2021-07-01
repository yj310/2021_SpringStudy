package kr.hs.study.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		System.out.println("id: " + dto.getUid());
		System.out.println("pw: " + dto.getUpass());
		
		model.addAttribute("result", dto);
		sqlsessiontemplate.insert("login.insert_data", dto);
		
		return "login/result";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam String uid) {
		System.out.println(uid);
		
		sqlsessiontemplate.delete("login.delete_data", uid);
		return "login/delete_result";
	}
	
	@GetMapping("/update")
	public String update(@RequestParam String uid) {
		System.out.println(uid);
		
		sqlsessiontemplate.update("login.update_data", uid);
		return "login/update_result";
	}
	
}
