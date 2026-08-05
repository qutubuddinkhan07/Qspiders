package com.qsp.service;

import com.qsp.dtos.EmployeeInputDto;
import com.qsp.entities.Employee;

public interface EmployeeService {
	String saveEmployeeService(EmployeeInputDto dto);

	Employee getEmployeeByIdService(Integer id);

	Employee updateEmployeeService(Employee employee);

	Employee deleteEmployeeService(Integer id);

	Employee makeEmployeeActiveService(Integer id);
}
