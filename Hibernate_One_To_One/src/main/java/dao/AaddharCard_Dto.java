package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.AaddharCard;
import dto.Person;

public class AaddharCard_Dto {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sohan");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	public void InsertData(AaddharCard aaddharCard)
	{
		Person person = aaddharCard.getPerson();
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(aaddharCard);
		entityTransaction.commit();
		System.out.println("Inserted Successfully");
	}
	
	public void FetchData(int id)
	{
		AaddharCard dbaaddharCard = entityManager.find(AaddharCard.class, id);

		
		System.out.println("Aadhar Card Details");
		System.out.println(dbaaddharCard);
		
		
	}

}
