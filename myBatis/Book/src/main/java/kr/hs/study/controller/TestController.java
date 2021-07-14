package kr.hs.study.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.model.dto.BookDTO;

@Controller
public class TestController {

	@Autowired
	SqlSessionTemplate sqlsessiontemplate;
	
	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/add")
	public String add() {
		return "book/book_form";
	}
	
	@PostMapping("/add")
	public String login_result(Model model, BookDTO dto) {
		System.out.println("title: " + dto.getTitle());
		System.out.println("author: " + dto.getAuthor());
		System.out.println("price: " + dto.getPrice());
		
		model.addAttribute("result", dto);
		sqlsessiontemplate.insert("book.add", dto);
		
		return "book/add_result";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam String title) {
		System.out.println(title);
		
		sqlsessiontemplate.delete("book.delete", title);
		return "book/delete_result";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		List<BookDTO> list = sqlsessiontemplate.selectList("book.list");

		model.addAttribute("list", list);
		
		return "book/list_result";
	}
	
	
	@GetMapping("/update")
	public String update(@RequestParam String title, Model model) {

		BookDTO dto = sqlsessiontemplate.selectOne("book.getitem", title);
		model.addAttribute("title", dto.getTitle());
		model.addAttribute("author", dto.getAuthor());
		model.addAttribute("price", dto.getPrice());
		return "book/update_book_form";
	}
	
	
	@PostMapping("/update")
	public String update_book(BookDTO dto, Model model) {
		
		sqlsessiontemplate.update("book.update", dto);
		model.addAttribute("result", dto);
		
		return "book/update_result";
	}
	
}
