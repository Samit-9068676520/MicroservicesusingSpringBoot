package com.springbootmicroservices2.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootmicroservices2.userservice.VO.ResponseTemplateVo;
import com.springbootmicroservices2.userservice.entity.User;
import com.springbootmicroservices2.userservice.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user)
	{
		return userService.saveUser(user);
	}
	@GetMapping("/{userId}")
	public ResponseTemplateVo getUserWithDeaprtment(@PathVariable String userId) {
		return userService.getUserWithDeaprtment(Long.parseLong(userId));
	}
}
