package Many_To_One;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class GetProductReview {
	
public static void main(String[] args) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Review review=entityManager.find(Review.class, 1);		
		
		System.out.println("Review Id:"+review.getId());
		System.out.println("Review Rating:"+review.getRating());
		System.out.println("Review Comment:"+review.getComment());
		System.out.println("Review Password:"+review.getPassword());
		System.out.println("*****************");
		
		Product product=review.getProduct();
		System.out.println("Product Id Is:"+product.getId());
		System.out.println("Product name Is:"+product.getName());
		System.out.println("Product Brand:"+product.getBrand());
		System.out.println("Product Type:"+product.getType());
		System.out.println("Product Cost:"+product.getCost());
		
		
	}


}
