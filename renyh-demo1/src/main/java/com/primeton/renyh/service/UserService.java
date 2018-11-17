package com.primeton.renyh.service;

import java.util.List;

import com.primeton.renyh.pojo.User;

public interface UserService {

	// 查询所有用户
	public List<User> query();

	// 根据id删除一个id
	public void remove(int id);

	// 创建一个用户
	public void create(User user);

	// 修改用户信息
	public void modify(User user);
}
