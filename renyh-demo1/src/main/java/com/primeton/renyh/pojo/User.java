package com.primeton.renyh.pojo;

import org.springframework.stereotype.Component;

/*
 * 用户实体类
 * 字段： 用户名  密码   
 */
@Component
public class User {

	private int uid;
	private String username;
	private String password;

	// 。。get/set方法

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// tostring方法
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + "]";
	}

	// 有参构造
	public User(int uid, String username, String password) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
	}

	// 无参构造
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
