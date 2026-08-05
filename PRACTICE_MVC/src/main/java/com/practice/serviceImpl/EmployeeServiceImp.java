package com.practice.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.dtos.IdDTO;
import com.practice.dtos.UpdateEmployeeDTO;
import com.practice.entities.Employee;
import com.practice.entities.EmployeeResponse;
import com.practice.repository.EmployeeRepository;
import com.practice.service.EmployeeService;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepository emprepo;

	@Override
	@Transactional
	public String addEmpService(Employee employee) {
		emprepo.save(employee);
		return "Employee Saved";
	}

	@Override
	public EmployeeResponse readEmpById(IdDTO idDTO) {
		Optional<Employee> optEmployee = emprepo.findById(idDTO.getId());
		if (optEmployee.isPresent()) {
			Employee employee = optEmployee.get();
			return new EmployeeResponse(true, "Employee Found Successfully", employee);
		}

		return new EmployeeResponse(false, "No employee found with id: " + idDTO.getId(), null);
	}

	@Override
	public EmployeeResponse getEmployeeForUpdate(Integer id) {
		Optional<Employee> optEmployee = emprepo.findById(id);
		if (optEmployee.isPresent()) {
			Employee employee = optEmployee.get();
			return new EmployeeResponse(true, "Employee found for update", employee);
		} else {
			return new EmployeeResponse(false, "No employee found for id: " + id, null);
		}
	}

	@Override
	@Transactional
	public EmployeeResponse updateEmployee(UpdateEmployeeDTO updateEmployeeDTO) {
		try {
			Optional<Employee> optEmployee = emprepo.findById(updateEmployeeDTO.getId());
			if (optEmployee.isPresent()) {
				Employee existingEmp = optEmployee.get();

				existingEmp.setName(updateEmployeeDTO.getName());
				existingEmp.setEmail(updateEmployeeDTO.getEmail());
				existingEmp.setDepartment(updateEmployeeDTO.getDepartment());
				existingEmp.setSalary(updateEmployeeDTO.getSalary());

				Employee updatedEmp = emprepo.save(existingEmp);

				return new EmployeeResponse(true, "Employee updated successfully!", updatedEmp);
			} else {
				return new EmployeeResponse(false, "Employee not found with id: " + updateEmployeeDTO.getId(), null);
			}
		} catch (Exception e) {
			return new EmployeeResponse(false, "Error updating employee: " + e.getMessage(), null);
		}
	}

	@Override
	@Transactional
	public EmployeeResponse deleteEmployee(Integer id) {
		try {
			Optional<Employee> optEmp = emprepo.findById(id);

			if (optEmp.isPresent()) {
				Employee emp = optEmp.get();
				emprepo.delete(emp);
				return new EmployeeResponse(true, "Employee with ID " + id + " has been successfully deleted!", null);
			} else {
				return new EmployeeResponse(false, "No employee found with ID: " + id, null);
			}
		} catch (Exception e) {
			return new EmployeeResponse(false, "Error deleting employee: " + e.getMessage(), null);
		}
	}

	// Implement the new method
	@Override
	public EmployeeResponse getEmployeeById(Integer id) {
		Optional<Employee> optEmp = emprepo.findById(id);

		if (optEmp.isPresent()) {
			Employee emp = optEmp.get();
			return new EmployeeResponse(true, "Employee found", emp);
		} else {
			return new EmployeeResponse(false, "No employee found with ID: " + id, null);
		}
	}

}
