package com.primeton.renyh.pojo;
/*
 * 组织机构表
 * 字段： id  部门    用户id
 */
public class Organization {

	private int oid;
	private String department;
	private User    uid;
	
	//..get/set方法
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public User getUid() {
		return uid;
	}
	public void setUid(User uid) {
		this.uid = uid;
	}
	
	//tostring方法
	@Override
	public String toString() {
		return "Organization [oid=" + oid + ", department=" + department + ", uid=" + uid + "]";
	}
	
	//有参构造
	public Organization(int oid, String department, User uid) {
		super();
		this.oid = oid;
		this.department = department;
		this.uid = uid;
	}
	
	//无参构造
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
