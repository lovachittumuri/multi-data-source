package com.demo.multi.employee.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.multi.employee.model.Employee;

@Repository
public class EmployeeJdbcRepository {
	private final JdbcTemplate jdbcTemplate;

	public EmployeeJdbcRepository(@Qualifier("employeeJdbcTemplate") JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Employee findById(Long employeeId) {
		String sql = "Select * from employee where employee_id = ?";

		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Employee.class), employeeId);
	}
}