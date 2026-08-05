package com.qsp.modelmapper;

import org.springframework.stereotype.Component;

import com.qsp.dtos.EmployeeInputDto;
import com.qsp.entities.Employee;

@Component
public class EmployeeModelMapperUtil {
	public Employee employeeInputDtoToEmployeeEntity(EmployeeInputDto dto) {
		Employee emp = new Employee();
		emp.setName(dto.getName());
		emp.setAddress(dto.getAddress());
		emp.setSalary(dto.getSalary());
		emp.setYoe(dto.getYoe());
		emp.setActive(true);
		return emp;
	}
}
