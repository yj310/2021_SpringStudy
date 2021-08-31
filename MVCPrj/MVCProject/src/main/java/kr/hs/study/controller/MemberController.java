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
	
	// member �߰�(ȸ������)
	@PostMapping("/add_member")
	public String addMember(Model model, MemberDTO dto) {

		model.addAttribute("member", dto);
		memberService.insert(dto);
		
		return "member/add_member_result";
	}
	
	// member ������ �ε�
	@GetMapping("/member/read")
	public String memberRead(@RequestParam String userid, Model model) {
		model.addAttribute("member", memberService.read(userid));
		return "member/read";
	}
	
	// member ������ ����
	@PostMapping("/member/update")
	public String updateMember(Model model, MemberDTO dto) {
		
		// ��й�ȣ Ȯ��
		boolean result = memberService.Check(dto.getUserid(), dto.getPasswd());
		model.addAttribute("member", dto);
		
		if(result) {
			// ��й�ȣ ��ġ
			// member ������ ������Ʈ
			memberService.update(dto);
			return "member/update_member_result";
			
		} else {
			// ��й�ȣ ����ġ
			// ���� ȭ�� �ٽ� �ҷ�����
			MemberDTO dto2 = memberService.read(dto.getUserid());
			return "member/read";
		}
		
	}
	
	// member ������ ����
	@PostMapping("/member/delete")
	public String deleteMember(Model model, MemberDTO dto) {
		// ��й�ȣ Ȯ��
		boolean result = memberService.Check(dto.getUserid(), dto.getPasswd());
		model.addAttribute("member", dto);
		
		if(result) {
			// ��й�ȣ ��ġ
			// member ������ ����
			memberService.delete(dto.getUserid());
			return "member/delete_member_result";
			
		} else {
			// ��й�ȣ ����ġ
			// ���� ȭ�� �ٽ� �ҷ�����
			MemberDTO dto2 = memberService.read(dto.getUserid());
			return "member/read";
		}
	}
	
}
