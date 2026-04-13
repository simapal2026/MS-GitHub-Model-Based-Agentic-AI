package com.ai_automation.example.demo.response;

import java.util.List;

import com.ai_automation.example.demo.model.User;

import lombok.Data;

@Data
public class FindAllUsersResponse {
	List<User> userList;
}