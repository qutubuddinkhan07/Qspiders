package com.qsp.test;

import com.qsp.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteData {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("a4");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student s = em.find(Student.class, 1);
		if (s == null) {
			System.out.println("Data not present in DB");
		} else {
			et.begin();

			em.remove(s); // delete in db
			et.commit();
		}
	}
}
