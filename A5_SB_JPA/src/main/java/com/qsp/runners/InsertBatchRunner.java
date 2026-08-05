package com.qsp.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.qsp.entities.Student;
import com.qsp.service.StudentService;

//@Component
public class InsertBatchRunner implements CommandLineRunner {

	@Autowired
	private StudentService studentservice;

	@Override
	public void run(String... args) throws Exception {
		List<Student> students = List.of(new Student("John", "New York", 25), new Student("SAM", "Las Vegas", 24),
				new Student("Arfa", "UAE", 27));

		studentservice.saveAllStudentService(students);
	}

}
