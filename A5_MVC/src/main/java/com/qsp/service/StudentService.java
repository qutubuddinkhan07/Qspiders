package com.qsp.service;

import com.qsp.dtos.IdDTO;
import com.qsp.entities.Student;

public interface StudentService {
	String addStudentService(Student student);

	String readStudentById(IdDTO idDTO);

	String updateStudentService(Student student);

	String deleteByIdService(IdDTO idDTO);
}
