package com.ZTI2018.ZTI_SimpleToDo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ZTI2018.ZTI_SimpleToDo.model.User;
import com.ZTI2018.ZTI_SimpleToDo.repository.IUserRopository;

@RestController
public class UserController {
	
	@Autowired
	private IUserRopository userRepository;
	
	@RequestMapping("/")
	public String home()
	{
		return "";
	}
	
//	@RequestMapping("/User")
//	public String addUser(User user)
//	{
//		userRepository.save(user);
//		return "";
//	}
	
	@GetMapping("/user")
	public List<User> getUser()
	{
		System.out.println("abc");
		return userRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable("id") Long userId)
	{
		Optional<User> user = userRepository.findById(userId);
		return user;
	}
}
