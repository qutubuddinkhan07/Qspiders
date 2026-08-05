package com.qsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qsp.entities.Student;

@Repository
public interface StudentReposistory extends JpaRepository<Student, Integer> {

}
