package com.qsp.manytomany;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("a4");

		Trainer t1 = new Trainer("A", 7);
		Trainer t2 = new Trainer("B", 5);
		Trainer t3 = new Trainer("C", 2);

		Subject s1 = new Subject("JAVA", 4);
		Subject s2 = new Subject("SQL", 1);
		Subject s3 = new Subject("SQL", 2);

		t1.setSubjects(List.of(s1, s2));
		t2.setSubjects(List.of(s1, s2));
		t3.setSubjects(List.of(s3));

		s1.setTrainers(List.of(t1, t2));
		s2.setTrainers(List.of(t1, t2));
		s3.setTrainers(List.of(t3));

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(t1);
		em.persist(t2);
		em.persist(t3);
		et.commit();

		emf.close();
	}
}
