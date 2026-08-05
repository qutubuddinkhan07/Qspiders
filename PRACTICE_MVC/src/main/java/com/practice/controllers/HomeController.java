package com.practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String getHomePage() {
		System.out.println("Home page request");
		return "home";
	}

	@RequestMapping("/addrequest")
	public String getAddEmpForm() {
		System.out.println("Add Employee Form");
		return "addempform";
	}

	@RequestMapping("/readrequest")
	public String getReadStudentForm() {
		System.out.println("Employee Read Form");
		return "readempform";
	}

	@RequestMapping("/deleterequest")
	public String getDeleteRequest() {
		System.out.println("Employee delete page");
		return "deleteempform";
	}
}
