package com.service.user.service;

import java.util.List;

import com.service.user.entity.User;

public interface IUserService {

	public User addUser(User u);

	public List<User> getAllUsers();
	
	public User getUserById(Integer id);

	public User updateUser(User u, Integer id);

	public void deleteUser(Integer id);

}
