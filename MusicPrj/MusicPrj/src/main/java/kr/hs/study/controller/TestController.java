package kr.hs.study.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.model.dto.MusicDTO;

@Controller
public class TestController {

	@Autowired
	SqlSessionTemplate sqlsessiontemplate;
	
	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/showlist")
	public String showlistPage(Model model) {
		List<MusicDTO> list = sqlsessiontemplate.selectList("music.getlist");
		model.addAttribute("list", list);
		return "music/showlist";
	}
	
	
	@GetMapping("/addmusic")
	public String addmusicPage() {
		return "music/addmusic";
	}
	
	@PostMapping("/addmusic")
	public String addmusic(Model model, MusicDTO dto) {
		
		model.addAttribute("music", dto);
		sqlsessiontemplate.insert("music.addmusic", dto);
		
		return "music/add_result";
	}
	
	
	@GetMapping("/searchmusic")
	public String searchmusicPage() {
		return "music/searchmusic";
	}
	
	@PostMapping("/searchmusic")
	public String searchmusic(@RequestParam String title, Model model) {
		List<MusicDTO> list = sqlsessiontemplate.selectList("music.searchmusic", title);
		model.addAttribute("list", list);
		return "music/showlist";
	}
	
	
	@GetMapping("/modifymusic")
	public String modifymusic(@RequestParam int id) {
		return "music/checkModifyPassword";
	}
	
	@PostMapping("/checkModifyPassword")
	public String checkModifyPassword(@RequestParam int id, @RequestParam String passwd, Model model) {
		MusicDTO dto = sqlsessiontemplate.selectOne("music.getitem", id);
		model.addAttribute("result", dto);
		if(passwd.equals(dto.getSong_passwd()) ) {
			return "music/modifymusic";
		} else {
			return "passwordfail";
		}
	}
	
	@PostMapping("/modifymusic")
	public String modifymusic(Model model, MusicDTO dto) {
		model.addAttribute("result", dto);
		sqlsessiontemplate.update("music.modifymusic", dto);
		return "music/modify_result";
	}
	
	
	@GetMapping("/deletemusic")
	public String deletemusic(@RequestParam int id) {
		return "music/checkDeletePassword";
	}
	
	@PostMapping("/checkDeletePassword")
	public String checkDeletePassword(@RequestParam int id, @RequestParam String passwd, Model model) {
		MusicDTO dto = sqlsessiontemplate.selectOne("music.getitem", id);
		model.addAttribute("music", dto);
		if(passwd.equals(dto.getSong_passwd()) ) {
			sqlsessiontemplate.delete("music.deletemusic", id);
			return "music/deletemusic_result";
		} else {
			return "passwordfail";
		}
	}
	
	
	
}
