package com.practice.service;

import com.practice.model.Login;
import com.practice.model.User;

public interface UserService {

	void register(User user);

	User validateUser(Login login);
}
