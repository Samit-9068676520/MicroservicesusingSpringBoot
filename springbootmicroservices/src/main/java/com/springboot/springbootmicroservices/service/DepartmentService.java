package com.springboot.springbootmicroservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootmicroservices.entity.Department;
import com.springboot.springbootmicroservices.repositry.DepartmentRepositry;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepositry departmentrepositry;

	public Department saveDepartment(Department department) {
		this.departmentrepositry.save(department);
		return department;
	}

	public Department getDepartment(long departmentId) {
		// TODO Auto-generated method stub
		List<Department> l1 = this.departmentrepositry.findAll();
		for (Department d1 : l1) {
			if (d1.getDepartmentId() == departmentId) {
				return d1;
			}
		}
		return null;
	}

	public List<Department> getallDepartment() {
		// TODO Auto-generated method stub
		return this.departmentrepositry.findAll();
	}

}
