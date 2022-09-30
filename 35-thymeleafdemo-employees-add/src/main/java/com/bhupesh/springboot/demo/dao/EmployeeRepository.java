package com.bhupesh.springboot.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhupesh.springboot.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findAllByOrderByLastNameAsc();

}
