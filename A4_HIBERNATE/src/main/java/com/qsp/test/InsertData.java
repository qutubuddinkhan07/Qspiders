package com.qsp.test;

import java.util.List;

import com.qsp.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertData {
	public static void main(String[] args) {
		EntityManagerFactory factry = Persistence.createEntityManagerFactory("a4");
		EntityManager manager = factry.createEntityManager();
		EntityTransaction et = manager.getTransaction();

		List<Student> students = List.of(new Student(null, "Nike", 30, "Saimon Salamandor", 90),
				new Student(null, "Adidas", 31, "showei", 91), new Student(null, "Daichu", 33, "PIKI", 94),
				new Student(null, "MAE", 39, "KAPA", 99));

		et.begin(); // start
		for (Student s : students) {
			manager.persist(s);
		}
		et.commit(); // complete
	}
}
