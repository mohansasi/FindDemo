package info.inetsolv;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		
		
		
		EntityManagerFactory EntityManagerFactory = Persistence.createEntityManagerFactory("finddemo");
		EntityManager entityManager = EntityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Address address = entityManager.find(Address.class,1l);
		System.out.println(address.getAid());
		System.out.println(address.getCity());
		System.out.println(address.getState());
		System.out.println(address.getStreet());
	
		
		
		entityManager.getTransaction().commit();
		entityManager.close();
		EntityManagerFactory.close();
		
		
	}
	

}

