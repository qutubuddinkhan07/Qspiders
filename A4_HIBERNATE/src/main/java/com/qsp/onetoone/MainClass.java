package com.qsp.onetoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) throws InterruptedException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("a4");
		Pan pan = new Pan("ETC05", "Rahul", 70000, 0);
		Aadhar aadhar = new Aadhar("12345638", "subhasis", 99999);

		aadhar.setPan(pan);
		pan.setAadhar(aadhar);

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(aadhar);
		et.commit();

//		Aadhar a = em.find(Aadhar.class, 1);
//		et.begin();
//		em.remove(a); // by doing this both Aadhar and pan got deleted
//		et.commit();
		emf.close();
	}
}
