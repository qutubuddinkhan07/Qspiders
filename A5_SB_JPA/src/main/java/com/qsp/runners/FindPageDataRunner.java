package com.qsp.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.qsp.entities.Student;
import com.qsp.service.StudentService;

//@Component
public class FindPageDataRunner implements CommandLineRunner {

	@Autowired
	private StudentService studentService;

	@Override
	public void run(String... args) throws Exception {
		List<Student> students = studentService.getStudentPage(4, 15);
		for (Student data : students) {
			System.out.println(data);
		}
	}

}
