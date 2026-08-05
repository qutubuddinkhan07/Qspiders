package com.qsp.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.qsp.service.StudentService;

//@Component
public class CrudOperationRunner implements CommandLineRunner {

	@Autowired
	private StudentService studentService;

	@Override
	public void run(String... args) throws Exception {
		String response = studentService.saveStudentService("Qutubuddin khan", 25, "Khordha");
		System.out.println(response);
	}

}
