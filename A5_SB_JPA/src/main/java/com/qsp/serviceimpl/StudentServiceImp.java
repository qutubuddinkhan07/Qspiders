package com.qsp.serviceimpl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.qsp.entities.Student;
import com.qsp.repository.StudentRepository;
import com.qsp.service.StudentService;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentRepository studentrepo;

	@Override
	@Transactional
	public String saveStudentService(String name, Integer age, String address) {
//		log.warn("Duplicate data may save " + name + " " + age + " " + address);
		Student student = new Student(name, address, age); // student without id
		student = studentrepo.save(student); // with id
		System.out.println(studentrepo.getClass());
//		log.info("Student saved with id " + student.getId());
		return "Student saved with id " + student.getId();
	}

	@Override
	public long getNumberOfStudentService() {
		return studentrepo.count();
	}

	@Override
	@Cacheable(value = "students", key = "#id") // read from cache
	public Student findStudentByIdService(Integer id) {
		Optional<Student> optObject = studentrepo.findById(id); // get optional entity object
		if (optObject.isPresent()) {
//			log.info("Student return with id: " + id);
			return optObject.get();
		} else {
//			log.error("Student not present with id: " + id);
			throw new NoSuchElementException("No Student found with id " + id);
		}
	}

	@Override
	@Transactional
	@CachePut(value = "students", key = "#id") // update the cache --> this will update the cache
	public Student updateStudentNameService(Integer id, String newName) {
		boolean isPresent = studentrepo.existsById(id);

		if (!isPresent) {
			throw new NoSuchElementException("Invalid id " + id);
		}

		Optional<Student> optObject = studentrepo.findById(id);
		Student student = optObject.get();
		student.setName(newName);
		student = studentrepo.save(student);
		return student;
	}

	@Override
	@Transactional
	@CacheEvict(value = "students", key = "#id") // delete cache
	public Student deleteStudentByIdService(Integer id) {
		if (!studentrepo.existsById(id)) {
			throw new NoSuchElementException("Invalid id " + id);
		}
		Student student = studentrepo.findById(id).get();
		studentrepo.deleteById(id);
		return student;
	}

	@Override
	@Transactional
	public String saveAllStudentService(List<Student> students) {
		studentrepo.saveAll(students);
		return "All student saved";
	}

	@Override
	public List<Student> getAllStudentService() {
		return studentrepo.findAll();
	}

	@Override
	public List<Student> getAllStudentByIdService(List<Integer> ids) {
		return studentrepo.findAllById(ids);
	}

	@Override
	@Transactional
	public void deleteAllStudentService() {
		studentrepo.deleteAll();
	}

	@Override
	public List<Student> getStudentPage(int pageNumber, int pageSize) {
		Sort sort = Sort.by("name").descending();
		Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);
		Page<Student> page = studentrepo.findAll(pageable);
		return page.getContent();
	}

	@Override
	public List<Student> getStudentAgeMoreThan(Integer age) {
//		return studentrepo.getByAgeGreaterThanEqual(age);
		return studentrepo.getDataAsPerAge(age);
	}

}
