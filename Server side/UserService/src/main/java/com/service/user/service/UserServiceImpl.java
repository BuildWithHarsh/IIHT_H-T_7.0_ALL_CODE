package com.service.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.user.entity.User;
import com.service.user.exception.UserNotFoundExceptionHandler;
import com.service.user.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	public UserRepository userRepo;

	@Override
	public User addUser(User u) {
		return userRepo.save(u);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public User updateUser(User u, Integer id) {
		User existingUser = userRepo.findById(id)
				.orElseThrow(() -> new UserNotFoundExceptionHandler("User", "id", Integer.toString(id)));
		existingUser.setUserFirstName(u.getUserFirstName());
		existingUser.setUserLastName(u.getUserLastName());
		existingUser.setUserPassword(u.getUserPassword());
		existingUser.setUserEmail(u.getUserEmail());
		existingUser.setUserRole(u.getUserRole());
		return userRepo.save(existingUser);
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);

	}

	@Override
	public User getUserById(Integer id) {
		return userRepo.findById(id)
				.orElseThrow(() -> new UserNotFoundExceptionHandler("User", "id", Integer.toString(id)));
	}

}
