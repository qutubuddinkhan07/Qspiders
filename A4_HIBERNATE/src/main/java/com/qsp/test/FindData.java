package com.qsp.test;

import java.util.List;

import com.qsp.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FindData {
	public static void main(String[] args) {
		EntityManagerFactory factry = Persistence.createEntityManagerFactory("a4");
		EntityManager manager = factry.createEntityManager();

		String sql = "select s from Student s";
		Query q = manager.createQuery(sql);
		List<Student> students = q.getResultList();

		for (Student s : students) {
			System.out.println(s);
		}
		factry.close();

		/*-
		 * Hibernate: 
		select
		s1_0.primary_key,
		s1_0.address,
		s1_0.age,
		s1_0.marks,
		s1_0.name 
		from
		learner s1_0
		Student(id=1, name=Nike, age=30, address=Saimon Salamandor, marks=90)
		Student(id=2, name=Adidas, age=31, address=showei, marks=91)
		Student(id=3, name=Daichu, age=33, address=PIKI, marks=94)
		Student(id=4, name=MAE, age=39, address=KAPA, marks=99)
		 */
	}
}
