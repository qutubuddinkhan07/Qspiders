package com.qsp.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.qsp.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ScheduleTasks {
	@Autowired
	private StudentService studentService;

	@Scheduled(fixedRate = 15000) // 15 second
	public void checkStudentStrengthPeriodically() {
		long numberOfStudent = studentService.getNumberOfStudentService();
		log.info("Number of student " + numberOfStudent);
	}

//	@Scheduled(cron = "20 0 18 * * *") // at 18:00:20
	@Scheduled(cron = "20 0 18 1 1 *")
	public void sendEmailEveryDayAt6PM() {
	}
}
