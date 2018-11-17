package com.primeton.renyh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.primeton.renyh.pojo.User;

@Mapper
public interface UserDao {

	// 根据ID查询
	User getById(@Param("id") int uid);

	// 获取行锁
	User getLock(@Param("id") int uid);

	// 查询所有
	List<User> queryAll();

	// 插入
	void insert(User user);

	// 修改
	void update(User user);

	// 删除
	void delete(@Param("id") int uid);

}
