package com.qsp.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.qsp.entities.Student;
import com.qsp.service.StudentService;

//@Component
public class FindDataByAgeRunner implements CommandLineRunner {

	@Autowired
	private StudentService studentService;

	@Override
	public void run(String... args) throws Exception {
		List<Student> students = studentService.getStudentAgeMoreThan(23);
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
