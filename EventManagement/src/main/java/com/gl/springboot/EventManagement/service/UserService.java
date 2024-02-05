package com.gl.springboot.EventManagement.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.gl.springboot.EventManagement.dto.SignUpDto;
import com.gl.springboot.EventManagement.entity.User;

public interface UserService extends UserDetailsService {
	public User save(SignUpDto signUpDto);

	User Save(SignUpDto signUpDto);
}