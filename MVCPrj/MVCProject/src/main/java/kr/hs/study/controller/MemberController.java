package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@GetMapping("/add_member")
	public String addMemberForm() {
		return "member/add_member";
	}
	
	
	@PostMapping("/add_member")
	public String addMember(Model model, MemberDTO dto) {

		model.addAttribute("member", dto);
		memberService.insert(dto);
		
		return "member/add_member_result";
	}
	
}
