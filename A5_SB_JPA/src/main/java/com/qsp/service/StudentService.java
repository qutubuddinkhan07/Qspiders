package com.qsp.service;

import java.util.List;

import com.qsp.entities.Student;

public interface StudentService {
	String saveStudentService(String name, Integer age, String address);

	long getNumberOfStudentService();

	Student findStudentByIdService(final Integer id);

	Student updateStudentNameService(Integer id, String newName);

	Student deleteStudentByIdService(Integer id);

	String saveAllStudentService(List<Student> students);

	List<Student> getAllStudentService();

	List<Student> getAllStudentByIdService(List<Integer> ids);

	void deleteAllStudentService();

	List<Student> getStudentPage(int pageNumber, int pageSize);

	List<Student> getStudentAgeMoreThan(Integer age);
}
