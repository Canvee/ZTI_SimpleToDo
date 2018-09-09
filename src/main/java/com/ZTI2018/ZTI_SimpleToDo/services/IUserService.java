package com.ZTI2018.ZTI_SimpleToDo.services;

import java.util.List;

import com.ZTI2018.ZTI_SimpleToDo.model.User;

public interface IUserService {
	List<User> getUsers();
	User getUser(Long userID);
}
