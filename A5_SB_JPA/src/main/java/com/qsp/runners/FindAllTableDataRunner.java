package com.qsp.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.qsp.entities.Student;
import com.qsp.service.StudentService;

//@Component
public class FindAllTableDataRunner implements CommandLineRunner {

	@Autowired
	private StudentService studentservice;

	@Override
	public void run(String... args) throws Exception {
		List<Student> students = studentservice.getAllStudentService();
		for (Student s : students) {
			System.out.println(s);
		}
	}

}
