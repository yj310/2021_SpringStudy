package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	// member 추가(회원가입)
	@PostMapping("/add_member")
	public String addMember(Model model, MemberDTO dto) {

		model.addAttribute("member", dto);
		memberService.insert(dto);
		
		return "member/add_member_result";
	}
	
	// member 데이터 로드
	@GetMapping("/member/read")
	public String memberRead(@RequestParam String userid, Model model) {
		model.addAttribute("member", memberService.read(userid));
		return "member/read";
	}
	
	// member 데이터 수정
	@PostMapping("/member/update")
	public String updateMember(Model model, MemberDTO dto) {
		
		// 비밀번호 확인
		boolean result = memberService.Check(dto.getUserid(), dto.getPasswd());
		model.addAttribute("member", dto);
		
		if(result) {
			// 비밀번호 일치
			// member 데이터 업데이트
			memberService.update(dto);
			return "member/update_member_result";
			
		} else {
			// 비밀번호 불일치
			// 정보 화면 다시 불러오기
			MemberDTO dto2 = memberService.read(dto.getUserid());
			return "member/read";
		}
		
	}
	
	// member 데이터 삭제
	@PostMapping("/member/delete")
	public String deleteMember(Model model, MemberDTO dto) {
		// 비밀번호 확인
		boolean result = memberService.Check(dto.getUserid(), dto.getPasswd());
		model.addAttribute("member", dto);
		
		if(result) {
			// 비밀번호 일치
			// member 데이터 삭제
			memberService.delete(dto.getUserid());
			return "member/delete_member_result";
			
		} else {
			// 비밀번호 불일치
			// 정보 화면 다시 불러오기
			MemberDTO dto2 = memberService.read(dto.getUserid());
			return "member/read";
		}
	}
	
}
