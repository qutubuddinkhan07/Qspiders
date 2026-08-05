package com.qsp.test;

import com.qsp.entity.Bank;
import com.qsp.entity.BankId;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestCompositeKey {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("a4");
		BankId id1 = new BankId("ICICIN0035", "721457");
		Bank bank1 = new Bank(id1, "ICICI", "VISAKHA");

		EntityManager em = emf.createEntityManager();
//		Bank searchedData = em.find(Bank.class, id1);
//		System.out.println(searchedData);

		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(bank1);
		et.commit();
		emf.close();
	}
}
