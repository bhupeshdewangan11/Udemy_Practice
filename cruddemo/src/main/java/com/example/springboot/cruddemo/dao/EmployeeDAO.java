package com.example.springboot.cruddemo.dao;

import java.util.List;

import com.example.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
}
