package com.service.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.user.entity.User;
import com.service.user.service.IUserService;

@RestController
public class UserController {

	@Autowired
	private IUserService userService;

	// create user
	@PostMapping("/users")
	public User createUser(@RequestBody User u) {
		return userService.addUser(u);
	}

	// get all users
	@GetMapping("/users")
	public List<User> getAllUser() {
		return userService.getAllUsers();
	}

	// get user by id
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable Integer id) {
		return userService.getUserById(id);
	}

	// update user
	@PutMapping("/users/{id}")
	public User updateUser(@RequestBody User u, @PathVariable Integer id) {
		return userService.updateUser(u, id);
	}

	// delete user
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
	}

}
