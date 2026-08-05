package com.onetomany;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("a4");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Branch b1 = new Branch("BHUB", "7534382", "Apollo");
		Branch b2 = new Branch("CUTTACK", "7532092", "Apollo");
		Branch b3 = new Branch("KHORDHA", "700892", "Apollo");

		Hospital h1 = new Hospital("Apollo", "Dr_Jhatka");
		h1.setBranches(List.of(b1, b2, b3));
		b1.setHospital(h1);
		b2.setHospital(h1);
		b3.setHospital(h1);
		et.begin();
		em.persist(h1);
		et.commit();

		emf.close();
	}
}
