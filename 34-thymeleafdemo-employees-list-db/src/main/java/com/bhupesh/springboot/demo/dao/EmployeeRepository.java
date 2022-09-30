package com.bhupesh.springboot.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhupesh.springboot.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
