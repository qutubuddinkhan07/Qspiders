package com.practice.service;

import com.practice.dtos.IdDTO;
import com.practice.dtos.UpdateEmployeeDTO;
import com.practice.entities.Employee;
import com.practice.entities.EmployeeResponse;

public interface EmployeeService {
	String addEmpService(Employee employee);

	EmployeeResponse readEmpById(IdDTO idDTO);

	EmployeeResponse getEmployeeForUpdate(Integer id); // method for showing update form

	EmployeeResponse updateEmployee(UpdateEmployeeDTO updateEmployeeDTO); // method for updating employee

	EmployeeResponse deleteEmployee(Integer id);

	EmployeeResponse getEmployeeById(Integer id);
}
