package com.blog.app.services;

import java.util.List;

import com.blog.app.payloads.UserDto;



public interface UserService {
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUser();
	void deletUser(Integer userId);
}
