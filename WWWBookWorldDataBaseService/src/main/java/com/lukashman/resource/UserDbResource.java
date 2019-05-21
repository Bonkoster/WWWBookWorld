package com.lukashman.resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lukashman.model.User;
import com.lukashman.repository.UserRepository;

@RestController
@RequestMapping("/rest/user")
public class UserDbResource {

	private UserRepository userRepository;
	
	public UserDbResource(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping("/{userId}")
	public User getUser(  @PathVariable( required = true ) final int userId ) {
		return userRepository.getOne(userId);
	}
	
	@PostMapping("/{user}")
	public User createUser(  @PathVariable( required = true ) final User user ) {
		return userRepository.saveAndFlush(user);
	}
	
	@DeleteMapping("/{user}")
	public void deleteUser(  @PathVariable( required = true ) final User user ) {
		userRepository.delete(user);
	}
	
}
