package com.qsp.serviceimpl;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qsp.dtos.EmployeeInputDto;
import com.qsp.entities.Employee;
import com.qsp.modelmapper.EmployeeModelMapperUtil;
import com.qsp.repository.EmployeeRepository;
import com.qsp.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	private final EmployeeRepository employeeRepository;
	private final EmployeeModelMapperUtil employeeModelMapperUtil;

	@Override
	@Transactional
	public String saveEmployeeService(EmployeeInputDto dto) {
		Employee emp = employeeModelMapperUtil.employeeInputDtoToEmployeeEntity(dto);
		emp = employeeRepository.save(emp);
		return "Employee saved with id: " + emp.getId();
	}

	@Override
	public Employee getEmployeeByIdService(Integer id) {
		if (!employeeRepository.existsById(id)) {
			throw new NoSuchElementException("No employee found with id: " + id);
		}
		Employee emp = employeeRepository.findById(id).get();
		if (!emp.isActive()) {
			throw new NoSuchElementException("Element not found with id: " + id);
		}
		return emp;
	}

	@Override
	@Transactional
	public Employee updateEmployeeService(Employee employee) {
		Integer id = employee.getId();
		if (id == null) {
			throw new NullPointerException("Employee can't have id null");
		}
		if (!employeeRepository.existsById(id)) {
			throw new NoSuchElementException("Employee not exist with id: " + id);
		}
		Employee emp = employeeRepository.save(employee);
		return emp;
	}

	@Override
	@Transactional
	public Employee deleteEmployeeService(Integer id) {
		Optional<Employee> optEmp = employeeRepository.findById(id);
		if (optEmp.isEmpty()) {
			throw new NoSuchElementException("Employee not present with id: " + id);
		}
		Employee emp = optEmp.get();
		emp.setActive(false);
		employeeRepository.save(emp);
		return emp;
	}

	@Override
	@Transactional
	public Employee makeEmployeeActiveService(Integer id) {
		Optional<Employee> optEmployee = employeeRepository.findById(id);
		if (optEmployee.isEmpty()) {
			throw new NoSuchElementException("Employee not present with id: " + id);
		}
		Employee emp = optEmployee.get();
		emp.setActive(true);
		emp = employeeRepository.save(emp);
		return emp;
	}
}
