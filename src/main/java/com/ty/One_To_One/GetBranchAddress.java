package com.ty.One_To_One;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetBranchAddress {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Branch branch = entityManager.find(Branch.class, 1);
		if (branch != null) {
			Address address=branch.getAddress();
			System.out.println("Branch Id is:" + branch.getId());
			System.out.println("Branch Name is:" + branch.getName());
			System.out.println("Branch phone is:" + branch.getPhone());
			System.out.println("Branch state is:" + branch.getState());
			System.out.println("Branch country is:" + branch.getCountry());

			System.out.println("Address Is Is:" + address.getId());
			System.out.println("Address RoadNumber Is:" + address.getRoadNumber());
			System.out.println("Address Area Is:" + address.getArea());
			System.out.println("Address Sreet Is:" + address.getStreet());
			System.out.println("Address state Is:" + address.getState());
			System.out.println("Address country Is:" + address.getCountry());
		} else {
			System.out.println("Branch is Not Found");
		}
	}

}
