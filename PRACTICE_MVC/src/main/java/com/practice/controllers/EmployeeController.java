package com.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice.dtos.IdDTO;
import com.practice.dtos.UpdateEmployeeDTO;
import com.practice.entities.Employee;
import com.practice.entities.EmployeeResponse;
import com.practice.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService empservice;

	@RequestMapping("/saveEmployee")
	public String addEmpAction(@ModelAttribute Employee employee, Model model) {
//		System.out.println(employee);
		String message = empservice.addEmpService(employee);
		model.addAttribute("message", message);
		return "response";
	}

	@RequestMapping(value = "/readempform", method = RequestMethod.POST)
//	@PostMapping("/readempform")
	public String readEmpAction(IdDTO idDTO, Model model) {
		EmployeeResponse response = empservice.readEmpById(idDTO);

		model.addAttribute("success", response.isSuccess());
		model.addAttribute("message", response.getMessage());
		model.addAttribute("employee", response.getEmployee());

		if (response.isSuccess()) {
			return "empdetails";
		} else {
			return "error";
		}
	}

	// show update form
	@RequestMapping("/updateempform")
	public String showUpdateForm(@RequestParam("id") Integer id, Model model) {
		EmployeeResponse response = empservice.getEmployeeForUpdate(id);

		if (response.isSuccess()) {
			model.addAttribute("employee", response.getEmployee());
			return "updateempform";
		} else {
			model.addAttribute("message", response.getMessage());
			return "error";
		}
	}

	@PostMapping("/updateemployee")
	public String updateEmployee(UpdateEmployeeDTO updateEmployeeDTO, Model model) {
		EmployeeResponse response = empservice.updateEmployee(updateEmployeeDTO);

		model.addAttribute("success", response.isSuccess());
		model.addAttribute("message", response.getMessage());

		if (response.isSuccess()) {
			model.addAttribute("employee", response.getEmployee());
			return "updatesuccess";
		} else {
			return "error";
		}
	}

	// Show delete search page (deleterequest.jsp)
	@GetMapping("/deleterequest")
	public String showDeleteSearchPage() {
		return "deleterequest"; // Returns the search page for delete
	}

	// Process the search and show confirmation page
	@GetMapping("/deleteempform")
	public String showDeleteConfirmation(@RequestParam("id") Integer id, Model model) {
		EmployeeResponse response = empservice.getEmployeeById(id);

		if (response.isSuccess()) {
			model.addAttribute("employee", response.getEmployee());
			return "deleteconfirm";
		} else {
			model.addAttribute("message", response.getMessage());
			return "error";
		}
	}

	// Process the actual deletion
	@PostMapping("/deleteemployee")
	public String deleteEmployee(@RequestParam("id") Integer id, Model model) {
		EmployeeResponse response = empservice.deleteEmployee(id);

		model.addAttribute("success", response.isSuccess());
		model.addAttribute("message", response.getMessage());

		return "deletesuccess";
	}
}
