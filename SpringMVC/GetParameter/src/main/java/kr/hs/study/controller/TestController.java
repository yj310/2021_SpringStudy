package kr.hs.study.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import kr.hs.study.model.dto.TestDTO;

@Controller
public class TestController {

	//
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		return "result";
	}
	

	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String[] c = request.getParameterValues("c");
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.print("c: ");
		
		for(String value : c) {
			System.out.print(value + "   ");
		}
		System.out.println();
		
		return "result";
	}
	
	
	@GetMapping("/test3")
	public String test3(HttpServletRequest request) {
		return "login_form";
	}
	
	@PostMapping("/login")
	public String login(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.println("id: " + id);
		System.out.println("pw: " + pw);
		
		return "index";
	}
	
	@GetMapping("/test4")
	public String test4(WebRequest request) {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		return "result";
	}

	@GetMapping("/test5/{a}/{b}/{c}")
	public String test5(@PathVariable int a, 
						@PathVariable int b, 
						@PathVariable int c) {

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		return "result";
	}
	
	@GetMapping("/test6") 
	public String test6(@RequestParam int a,
						@RequestParam int b,
						@RequestParam (value="c")int cc) {

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + cc);
		
		return "result";
	}
	
	@GetMapping("/test7") 
	public String test7(@RequestParam int a,
						@RequestParam int b,
						@RequestParam int[] c) {

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.print("c: ");
		
		for(int value : c) {
			System.out.print(value + "   ");
		}
		System.out.println();
		
		return "result";
	}
	
	@GetMapping("/test8")
	public String test8(@RequestParam int a, 
						@RequestParam int b) {

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		return "result";
		
	}
	
	@GetMapping("/test9")
	public String test9(@RequestParam int a,
						@RequestParam int b,
						@RequestParam int c,
						@RequestParam(required=false) String d) {

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		
		return "result";
	}
	
	@GetMapping("test10")
	public String test10(@RequestParam Map<String, String> map) {
		String a = map.get("a");
		String b = map.get("b");
		String c = map.get("c");

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		return "result";
	}
	
	@GetMapping("test11")
	public String test11(@RequestParam Map<String, String> map,
						@RequestParam List<String> c) {
		String a = map.get("a");
		String b = map.get("b");

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.print("c: ");
		
		for(String value : c) {
			System.out.print(value + "   ");
		}
		System.out.println();
		
		return "result";
	}
	
	@GetMapping("/test12")
	public String test12(@ModelAttribute TestDTO dto) {
		
		System.out.println("a : " + dto.getA());
		System.out.println("b : " + dto.getB());
		System.out.println("c : " + dto.getC());
		
		return "result";
	}
	
	
}
