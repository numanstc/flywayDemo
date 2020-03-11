package com.example.flyway.api;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flyway.model.User;
import com.example.flyway.repository.UserRepository;

@RestController
@RequestMapping("/")
public class UserApi {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<User> getAll() {
		return userRepository.findAll();
	}
}
