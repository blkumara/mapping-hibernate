package com.ty.One_To_One;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteBranchAddress {
	
	public static void main(String[] args) {
		


		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Branch branch=entityManager.find(Branch.class, 2);
		Address address=branch.getAddress();
		
		entityTransaction.begin();
		entityManager.remove(branch);
		entityManager.remove(address);
		entityTransaction.commit();
		
		System.out.println("Deleted");
	}

}
