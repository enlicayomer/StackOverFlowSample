package com.eteration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eteration.entity.User;
import com.eteration.repository.UserRepository;

@RestController
@RequestMapping("u")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping("add")
	public ResponseEntity<User> addUser(@RequestBody User user) {

//		if (userRepository.getUserByUserMail(user.getUserMail()).getUserMail()==null)
//		{
//			return new ResponseEntity<User>(HttpStatus.CONFLICT);
//		}else
		return new ResponseEntity<User>(
				userRepository.save(new User(user.getUserName(), user.getUserMail(), user.getPassword())),
				HttpStatus.CREATED);
	}

	@DeleteMapping("delete/{userId}")
	public ResponseEntity<Void> deleteUser(@PathVariable("userId") Long id) {
		if (userRepository.exists(id)) {
			userRepository.delete(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@GetMapping("get/{userId}")
	public ResponseEntity<User> getUser(@PathVariable("userId") Long id) {
		if (userRepository.exists(id))
			return new ResponseEntity<User>(userRepository.getUserById(id), HttpStatus.OK);
		else
			return new ResponseEntity<User>(HttpStatus.NO_CONTENT);

	}
	

}
