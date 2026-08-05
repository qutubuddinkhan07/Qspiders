package com.qsp.runners;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

import com.qsp.service.StudentService;

//@Component
public class DataDumpingRunner implements CommandLineRunner {

	@Value("${db.dumpingsize}")
	private long dumpingsize;

	@Autowired
	private StudentService studentService;

	@Autowired
	private Random random;

	@Override
	public void run(String... args) throws Exception {
		long actualDataSize = studentService.getNumberOfStudentService();
		if (actualDataSize < dumpingsize) {
			long numberOfInsertion = dumpingsize - actualDataSize;
			for (long val = 1; val <= numberOfInsertion; val++) {
				String name = UUID.randomUUID().toString().substring(0, 5);
				Integer age = random.nextInt(21, 25);
				String address = UUID.randomUUID().toString().substring(0, 5);
				studentService.saveStudentService(name, age, address);
			}
		}
	}

}
