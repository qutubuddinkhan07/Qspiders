package com.qsp.controller;

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
	public String getAddStudentForm() {
		System.out.println("Add student request");
		return "addstudentform";
	}

	@RequestMapping("/readrequest")
	public String getReadStudentForm() {
		return "readstudentform";
	}

	@RequestMapping("/updaterequest")
	public String getUpdateRequestForm() {
		return "updateform";
	}

	@RequestMapping("/deleterequest")
	public String getDeleteRequest() {
		return "deleteform";
	}
}
