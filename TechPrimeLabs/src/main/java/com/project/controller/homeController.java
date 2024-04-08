package com.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.entity.user;
import com.project.repository.userRepository;
import com.project.service.userService;

@Controller
public class homeController {

	@Autowired
	private userService us;
	
	@Autowired
	private userRepository ur;

	@GetMapping("/Home")
	public String showHome() {
		return "home";
	}

	@GetMapping("/Loginhere")
	public String loginApi() {
		return "login";
	}

	@PostMapping("/loginD")
	public String postMethodName(@RequestParam("email") String email,
            @RequestParam("password") String password,Model model) {
		
		
		
		user user2=us.findByemail(email);
		
		if(user2==null)
		{
			user user=new user();
			user.setEmail(email);
			user.setPassword(password);
			ur.save(user);
			return "dashboard";
		}
		else
		{
			
			String em=user2.getEmail();
			String pass=user2.getPassword();
			
			if(em.equals(email)  && pass.equals(password))
			{
				return "dashboard";
			}
			else
			{
				model.addAttribute("m","wrong credentials");
				return "login";
			}
		
			
		}
		
		
	}

}
