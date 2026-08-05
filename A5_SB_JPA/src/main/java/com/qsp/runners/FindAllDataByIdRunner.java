package com.qsp.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.qsp.entities.Student;
import com.qsp.service.StudentService;

//@Component
public class FindAllDataByIdRunner implements CommandLineRunner {

	@Autowired
	private StudentService studentService;

	@Override
	public void run(String... args) throws Exception {
		List<Integer> ids = List.of(5, 6, 7, 8, 34);
		List<Student> students = studentService.getAllStudentByIdService(ids);
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
