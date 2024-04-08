package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.user;

@Repository
public interface userRepository extends JpaRepository<user,Integer>{

	
	public user findByemail(String email);
	public String findBypassword(String password);
	
}
