package com.primeton.renyh.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primeton.renyh.dao.UserDao;
import com.primeton.renyh.pojo.User;
import com.primeton.renyh.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> query() {
		return userDao.queryAll();
	}

	@Override
	public void remove(int id) {
		userDao.delete(id);
	}

	@Override
	public void create(User user) {
		userDao.insert(user);

	}

	@Override
	public void modify(User user) {

	}

}
