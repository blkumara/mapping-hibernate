package com.ty.One_To_many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPersonBankAccount {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = entityManager.find(Person.class, 1);
		if (person != null) {
			System.out.println("Person Id Is:" + person.getId());
			System.out.println("Person Name Is:" + person.getName());
			System.out.println("Person Age Is:" + person.getAge());
			System.out.println("Person Address Is:" + person.getAddress());
			System.out.println("Person Mobile Is:" + person.getMobile());

			List<BankAccount> accounts = person.getAccount();
			for (BankAccount bankAccount : accounts) {
				System.out.println("Account Id Is:" + bankAccount.getId());
				System.out.println("Account AccNo Is:" + bankAccount.getAccNo());
				System.out.println("Account Branch Is:" + bankAccount.getBranch());
				System.out.println("Account Address Is:" + bankAccount.getAddress());
			}
		} else {

			System.out.println("Person Not Found");
		}
	}
}
