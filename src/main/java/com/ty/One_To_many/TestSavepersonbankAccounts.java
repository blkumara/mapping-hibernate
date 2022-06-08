package com.ty.One_To_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavepersonbankAccounts {
	public static void main(String[] args) {



		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=new  Person();
		person.setName("varun");
		person.setAge(22);
		person.setMobile(9844648667l);
		person.setAddress("Hassan");
		
		
		BankAccount account1=new BankAccount();
		account1.setAccNo(18068859651852l);
		account1.setBranch("Bidre");
		account1.setAddress("Bidre");
		
		BankAccount account2=new BankAccount();
		account2.setAccNo(4587454857415l);
		account2.setBranch("Hassan");
		account2.setAddress("M G Road");
		
		List<BankAccount> list=new ArrayList<BankAccount>();
		list.add(account1);
		list.add(account2);
		
		person.setAccount(list);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(account1);
		entityManager.persist(account2);
		entityTransaction.commit();
		
		System.out.println("Added");
	}
}
