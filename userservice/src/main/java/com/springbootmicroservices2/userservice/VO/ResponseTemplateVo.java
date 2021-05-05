package com.springbootmicroservices2.userservice.VO;

import com.springbootmicroservices2.userservice.entity.User;

public class ResponseTemplateVo {
	private User user;
	private Department department;
	public ResponseTemplateVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseTemplateVo(User user, Department department) {
		super();
		this.user = user;
		this.department = department;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
