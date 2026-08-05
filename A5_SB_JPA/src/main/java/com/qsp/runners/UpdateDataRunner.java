package com.qsp.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.qsp.entities.Student;
import com.qsp.service.StudentService;

//@Component
public class UpdateDataRunner implements CommandLineRunner {

	@Autowired
	private StudentService studentService;

	@Override
	public void run(String... args) throws Exception {
		Integer id = 7;
		Student student = studentService.findStudentByIdService(id);
		System.out.println("Old student " + student.toString());
		student = studentService.updateStudentNameService(id, "Jhonson");
		System.out.println("New Student " + student.toString());
	}
}
