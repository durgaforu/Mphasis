package com.product.service;

import com.product.dao.UserDao;
import com.product.dao.UserDaoImpl;
import com.product.model.User;

public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDaoImpl();

	@Override
	public boolean validateUser(User user) {

		return userDao.valiidateUser(user);
	}

}
