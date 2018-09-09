package com.ZTI2018.ZTI_SimpleToDo.services;

import java.util.List;

import com.ZTI2018.ZTI_SimpleToDo.model.User;
import com.ZTI2018.ZTI_SimpleToDo.repository.IUserRopository;

public class UserService implements IUserService {

	private IUserRopository userRepository;
	
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(Long userID) {
		return userRepository.findById(userID).orElse(null);
	}

}
