package com.practice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.practice.dao.UserDao;
import com.practice.model.Login;
import com.practice.model.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	  public UserDao userDao;

	  public void register(User user) {
	    userDao.register(user);
	  }

	  public User validateUser(Login login) {
	    return userDao.validateUser(login);
	}

}
