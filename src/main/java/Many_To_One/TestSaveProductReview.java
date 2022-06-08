package Many_To_One;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveProductReview {
	

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = ((EntityManagerFactory) entityManagerFactory).createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Review review1 = new Review();
		review1.setRating(4);
		review1.setComment("Nice");
		review1.setPassword("varun@123");
		
		Review review2 = new Review();
		review2.setRating(3);
		review2.setComment("imporve Shipping speed");
		review2.setPassword("varun@123");
		
		
		Review review3= new Review();
		review3.setRating(5);
		review3.setComment("Good Product");
		review3.setPassword("varun@123");
		
		Product product = new Product();  
		product.setName("TV");
		product.setBrand("Lg");
		product.setType("LED");
		product.setCost(15000);
		
		
		
		
		review1.setProduct(product);
		review2.setProduct(product);
		review3.setProduct(product);
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityManager.persist(review1);
		entityManager.persist(review2);
		entityManager.persist(review3);
		
		entityTransaction.commit();
	}


}
