package com.qsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qsp.dtos.IdDTO;
import com.qsp.entities.Student;
import com.qsp.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping("/addaction")
	public String addStudentAction(@ModelAttribute Student student, Model model) {
		System.out.println(student);
		String message = studentService.addStudentService(student);
		model.addAttribute("message", message);
		return "response";
	}

	@RequestMapping("/readstudentaction")
	public String readStudentAction(IdDTO idDTO, Model model) {
		String message = studentService.readStudentById(idDTO);
		model.addAttribute("message", message);
		return "response";
	}

	@RequestMapping("/updateaction")
	public String updateStudent(Student student, Model model) {
		String message = studentService.updateStudentService(student);
		model.addAttribute("message", message);
		return "response";
	}

	@RequestMapping("/deleteaction")
	public String deleteStudent(@ModelAttribute IdDTO idDTO, Model model) {
		String message = studentService.deleteByIdService(idDTO);
		model.addAttribute("message", message);
		return "response";
	}
}
