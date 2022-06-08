package com.ty.One_To_One;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveBranchAddress {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Branch branch=new Branch();
		branch.setName("HDFC");
		branch.setPhone(8759651258l);
		branch.setState("Karnataka");
		branch.setCountry("India");
		
		
		Address address=new Address();
		address.setStreet("8th cross");
		address.setArea("BM Road");
		address.setRoadNumber(15);
		address.setState("Karnataka");
		address.setCountry("India");
		
		branch.setAddress(address);
		
		entityTransaction.begin();
		entityManager.persist(branch);
		entityManager.persist(address);
		entityTransaction.commit();
		
		System.out.println("Saved");
		
	}

}
