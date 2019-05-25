package com.lukashman.resource;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping( path = "/{userId}", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<User> getUser(  @PathVariable( required = true ) final int userId ) {
		return ResponseEntity.ok(userRepository.getOne(userId));
	}
	
	@PostMapping( path = "/{user}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<User> createUser(  @PathVariable( required = true )@RequestBody final User user ) {
		return ResponseEntity.ok(userRepository.saveAndFlush(user));
	}
	
	@DeleteMapping( path = "/{user}", consumes = MediaType.APPLICATION_JSON_VALUE )
	public void deleteUser(  @PathVariable( required = true ) @RequestBody final User user ) {
		userRepository.delete(user);
	}
}
