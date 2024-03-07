package com.example.sb.exercise;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/tl")
public class ThymeleafeController {
	
	@GetMapping("/tag")
	public String tag(Model model) {
		model.addAttribute("name", "제임스");
		model.addAttribute("data", "<b>Hello Spring</b>");
		return "thymeleaf/tag.html";	
	}
		
		@GetMapping("/el")
		public String el(HttpSession session, Model model) {
			Member m1 = new Member(101, "제임스", 25);
			model.addAttribute("member", m1);
			Member m2 = new Member(102, "마리아", 23);
			List<Member> list = new ArrayList<>();
			list.add(m1); list.add(m2);
			model.addAttribute("memberList", list);
			
			session.setAttribute("sessUname", "제임스");
			session.setAttribute("sessAge", 25);
			return "thymeleaf/el.html";
	}
}