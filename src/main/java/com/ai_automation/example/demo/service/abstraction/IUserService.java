package com.ai_automation.example.demo.service.abstraction;

import java.util.List;

import com.ai_automation.example.demo.model.User;

public interface IUserService {

	List<User> findAll();

	User findByUserName(String username);

	User findByTcno(String tcno);

	User createNewUser(User user);
	
	boolean isUsernameExist(String username);
	
	boolean isTcnoExist(String tcno);

}