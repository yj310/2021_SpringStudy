package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import kr.hs.study.model.dto.MemberDTO;
import kr.hs.study.service.MemberService;

@Controller
public class MemberController {


	@Autowired
	MemberService memberService;
	
	@GetMapping("/member")
	public String memberList(Model model) {
		List<MemberDTO> memberlist = memberService.list();
		model.addAttribute("list", memberlist);
		return "member/member_list";
	}
	
	
}
