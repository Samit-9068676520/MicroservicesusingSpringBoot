package com.springbootmicroservices2.userservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springbootmicroservices2.userservice.VO.Department;
import com.springbootmicroservices2.userservice.VO.ResponseTemplateVo;
import com.springbootmicroservices2.userservice.entity.User;
import com.springbootmicroservices2.userservice.repositry.UserRepositry;

@Service
public class UserService {
	@Autowired
	private UserRepositry userrepositry;
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userrepositry.save(user);
	}

	public ResponseTemplateVo getUserWithDeaprtment(long userId) {
		// TODO Auto-generated method stub
		User us=null;
		ResponseTemplateVo vo=new ResponseTemplateVo();
		List<User> l1=userrepositry.findAll();
		for(User u1:l1 )
		{
			if (u1.getUserId()==userId)
			{
				us=u1;
			}
		}
		Department department=restTemplate.getForObject("http://localhost:9090/departments/"+us.getDepartmentId(), Department.class);
		vo.setDepartment(department);
		vo.setUser(us);
		return vo;
	}	
}
