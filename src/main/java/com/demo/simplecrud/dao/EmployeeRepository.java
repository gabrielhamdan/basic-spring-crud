package com.demo.simplecrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.simplecrud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
