package com.nilesh.service;

import com.nilesh.dao.UserDao;
import com.nilesh.dao.UserDaoImpl;
import com.nilesh.entity.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public UserServiceImpl() {
		userDao= new UserDaoImpl();
	}

	@Override
	public boolean login(User user) {
		return userDao.login(user);
	}
	
}
