package com.springboot.springbootmicroservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springbootmicroservices.entity.Department;
import com.springboot.springbootmicroservices.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentservice;
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department)
	{
		return this.departmentservice.saveDepartment(department);
	}
	
	@GetMapping("/{departmentId}")
	public Department getDepartment(@PathVariable String departmentId)
	{
		return this.departmentservice.getDepartment(Long.parseLong(departmentId));
	}
	@GetMapping("/")
	public List<Department> getallDepartment(){
		return this.departmentservice.getallDepartment();
	}
}
