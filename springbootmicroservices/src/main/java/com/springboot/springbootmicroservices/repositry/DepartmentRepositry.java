package com.springboot.springbootmicroservices.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.springbootmicroservices.entity.Department;

@Repository
public interface DepartmentRepositry extends JpaRepository<Department, Long> {



}
