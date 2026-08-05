package com.qsp.serviceimplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.dtos.IdDTO;
import com.qsp.entities.Student;
import com.qsp.repository.StudentReposistory;
import com.qsp.service.StudentService;

import jakarta.transaction.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentReposistory studentrepo;

	@Override
	@Transactional
	public String addStudentService(Student student) {
		studentrepo.save(student);
		return "student added";
	}

	@Override
	public String readStudentById(IdDTO idDTO) {
		Optional<Student> optStudent = studentrepo.findById(idDTO.getId());
		String res = "";
		if (optStudent.isPresent()) {
			Student student = optStudent.get();
			res = res + "id: " + student.getId() + " name: " + student.getName() + " age: " + student.getAge()
					+ " address: " + student.getAddress();
			return res;
		}

		return "Student not found with id: " + idDTO.getId();
	}

	@Override
	public String updateStudentService(Student student) {
		if (!studentrepo.existsById(student.getId())) {
			return "Student not present with id: " + student.getId();
		}
		studentrepo.save(student);
		return "Student data updated";
	}

	@Override
	@Transactional
	public String deleteByIdService(IdDTO idDTO) {
		if (!studentrepo.existsById(idDTO.getId())) {
			return "Student not present with id: " + idDTO.getId();
		}
		studentrepo.deleteById(idDTO.getId());
		return "Student deleted";
	}

}
