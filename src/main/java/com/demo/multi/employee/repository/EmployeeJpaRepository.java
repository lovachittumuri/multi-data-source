package com.demo.multi.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.multi.employee.model.Employee;

public interface EmployeeJpaRepository extends JpaRepository<Employee, Long> {
}
