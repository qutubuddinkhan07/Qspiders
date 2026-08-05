package com.qsp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.qsp.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	// this much only needed in repository or DAO

	List<Student> getByName(String name);

	List<Student> getByAgeGreaterThanEqual(Integer age);

	@Query("select s from Student s where s.age = :age")
	List<Student> getDataAsPerAge(@Param("age") Integer age);
}
