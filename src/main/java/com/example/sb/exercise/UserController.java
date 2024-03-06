package com.example.sb.exercise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.sb.Users.User;
import com.example.sb.Users.UserService;

@Controller	
@RequestMapping("/user")
public class UserController {
	@Autowired private UserService userSvc;	// UserService 를 쓸 수 있다
		@GetMapping("/list/{page}")
		public String list(@RequestParam int page, Model model) {
			List<User> list = userSvc.getUserList(page);
			model.addAttribute("userList", list);
			return "user/list";
	}
}