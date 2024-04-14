package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Bus;
import dto.Passengers;

public class BusDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sohan");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void InsertBus(Bus bus) {

		entityTransaction.begin();
		entityManager.persist(bus);
		entityTransaction.commit();
	}
	
	public void InsertBoth(Bus bus) {

		entityTransaction.begin();
		//for list of passengers to insert
		List<Passengers>list  = bus.getPassengers();
		for(Passengers data: list)
		{
			entityManager.persist(data);
			
		}
		
		entityManager.persist(bus);
		entityTransaction.commit();
		
		System.out.println("Inserted Successfully");
	}
	
	public void InsertPassengersData(int id,List<Passengers>list) {

		
		Bus dbBus = entityManager.find(Bus.class, id);
		dbBus.setPassengers(list);;
		entityTransaction.begin();
		//for list of passengers to insert
		for(Passengers data: list)
		{
			entityManager.persist(data);
			
		}
		
		entityTransaction.commit();
		
		System.out.println("Inserted Successfully");
	}

	
	public void Fetch_Single(int id, Bus bus) {
		Bus dbbus =entityManager.find(Bus.class, id);
		
		System.out.println(dbbus);
		
	}
	
	public void Fetch_All(Bus bus)
	{
		Query query = entityManager.createQuery("Select b from Bus b");
		List<Bus>list = query.getResultList();
		
		System.out.println(list);
				
	}
	
	public void Update_Bus(int id,Bus bus)
	{
		
		Bus dbbus = entityManager.find(Bus.class, id);
		bus.setBusId(id);
		
		List<Passengers>list = dbbus.getPassengers();
		
		
	
		System.out.println(dbbus.getPassengers());
		
		bus.setPassengers(list);
		
		entityTransaction.begin();
		entityManager.merge(bus);

		entityTransaction.commit();
		System.out.println("Successfully Updated");
		
	}
	public void Update_Both(int id,Bus bus)
	{
		
		Bus dbbus = entityManager.find(Bus.class, id);
		bus.setBusId(id);
		
		entityTransaction.begin();
		entityManager.merge(bus);
		entityTransaction.commit();
		System.out.println("Successfully Updated ID"+id);
		
	}



}
