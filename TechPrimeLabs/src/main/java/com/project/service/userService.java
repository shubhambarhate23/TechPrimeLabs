package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.user;
import com.project.repository.userRepository;

@Service
public class userService {

	@Autowired
	private userRepository ur;
	
	
	
	public user findByemail(String email)
	{
		user email1=ur.findByemail(email);
		return email1;
	}
	

}
