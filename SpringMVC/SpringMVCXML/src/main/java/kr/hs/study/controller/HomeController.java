package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		System.out.println("home");
		return "WEB-INF/views/index.jsp";
	}

	
	// get 방식으로 /test1으로 접속했을 때 콘솔에 test1출력
	// test1.jsp만들어서 web으로 출력
	@RequestMapping(value="/test1", method= {RequestMethod.GET, RequestMethod.POST})		
	public String test1() {
		System.out.println("test1");
		return "WEB-INF/views/test1.jsp";
		//return "test1";
	}


}
