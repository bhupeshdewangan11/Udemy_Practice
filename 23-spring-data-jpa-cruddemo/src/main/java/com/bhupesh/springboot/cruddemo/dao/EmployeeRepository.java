package com.bhupesh.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhupesh.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
