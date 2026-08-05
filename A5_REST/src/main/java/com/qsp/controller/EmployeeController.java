package com.qsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.dtos.ApiResponse;
import com.qsp.dtos.EmployeeInputDto;
import com.qsp.entities.Employee;
import com.qsp.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService empService;

	@PostMapping
	public ResponseEntity<ApiResponse> addEmployeeController(@RequestBody EmployeeInputDto empdto) {
		String serviceResponse = empService.saveEmployeeService(empdto);
		ApiResponse response = new ApiResponse(true, "string", serviceResponse);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.CREATED);
	}

	@GetMapping
	public ApiResponse getEmployeeByIdController(
			@RequestParam(name = "id", required = false, defaultValue = "0") Integer id) {
		Employee emp = empService.getEmployeeByIdService(id);
		return new ApiResponse(true, "object", emp);
	}

	@PutMapping
	public ApiResponse updateEmployeeController(@RequestBody Employee employee) {
		Employee servicResponse = empService.updateEmployeeService(employee);
		return new ApiResponse(true, "object", servicResponse);
	}

	@DeleteMapping("/{id}")
	public ApiResponse deleteEmployeeController(@PathVariable("id") Integer id) {
		Employee emp = empService.deleteEmployeeService(id);
		return new ApiResponse(true, "object", emp);
	}

	@PatchMapping
	public ResponseEntity<ApiResponse> makeEmployeeActiveController(
			@RequestParam(name = "id", required = false, defaultValue = "0") Integer id) {
		Employee emp = empService.makeEmployeeActiveService(id);
		ApiResponse response = new ApiResponse(true, "object", emp);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.OK);
	}

//	@ExceptionHandler(NoSuchElementException.class)
//	public ApiResponse handleNoSuchElementException(NoSuchElementException ex) {
//		return new ApiResponse(false, "string", ex.getMessage());
//	}
}
