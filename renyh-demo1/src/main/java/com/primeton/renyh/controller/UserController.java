package com.primeton.renyh.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.primeton.renyh.pojo.User;
import com.primeton.renyh.service.UserService;

import io.swagger.annotations.ApiOperation;

/*
 * 用户的controller层d
 * 用户的增删改查
 */
@RestController
@RequestMapping(value = "/api/ci/users")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private User user;

	/**
	 * 测试方法
	 */
	@RequestMapping("/index")
	public String index() {
		return "seccess";
	}

	/**
	 * 查询所有用户信息
	 * 
	 * @return 所有用户信息
	 * @throws Exception
	 */
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	@ApiOperation(value = "查询用戶")
	public List<User> query() throws Exception {
		return userService.query();
	}

	/**
	 * 根据id删除用户
	 * 
	 * @param id 用户id
	 *            
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ApiOperation(value = "根据id删除用户")
	public String remove(@PathVariable int id) throws Exception {
		userService.remove(id);
		return "你已经删掉了id为" + id + "的用户";
	}

	/**
	 * 添加一个用户
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	@ApiOperation(value = "添加用户")
	public String create() throws Exception {
		user.setPassword("222");
		user.setUsername("小明");
		userService.create(user);
		return "增加用户";
	}

	/**
	 * 修改用户部分信息
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	@ApiOperation(value = "修改用户部分信息")
	public String modify() throws Exception {
		userService.modify(user);
		return "修改用户";
	}

}
