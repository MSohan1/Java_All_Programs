package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.CompanyTCS;

public class CompanyTCS_Dao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sohan");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void InsertData(CompanyTCS companyTCS) {
		entityTransaction.begin();
		entityManager.persist(companyTCS);//same as Insert!!
		entityTransaction.commit();
		System.out.println("Successfully Inserted");

	}

	public void delete(int id) {
		CompanyTCS dbcompanyTCS = entityManager.find(CompanyTCS.class, id);
		entityTransaction.begin();
		entityManager.remove(dbcompanyTCS);//same as delete!!
		entityTransaction.commit();
		System.out.println("Successfully deleted");

	}

	public void update(int id, CompanyTCS newdata) {
		CompanyTCS dbCompanyTCS = entityManager.find(CompanyTCS.class, id);
		newdata.setEmpolyeeID(id);
		entityTransaction.begin();
		entityManager.merge(newdata);//same as Update Query!
		entityTransaction.commit();
	}

	public void UpdatePhone(int id, long phon) {
		CompanyTCS dbcompany = entityManager.find(CompanyTCS.class, id);
		CompanyTCS companyTCS = new CompanyTCS();
		companyTCS.setEmpolyeeID(id);
		companyTCS.setEmployeeephnnumber(phon);
		
		companyTCS.setEmployeeName(dbcompany.getEmployeeName());//assigning old data from database to a new Column
		companyTCS.setEmployeeDesignation(dbcompany.getEmployeeDesignation());
		
		System.out.println(dbcompany.getEmployeeName());
		
		entityTransaction.begin();
		entityManager.merge(companyTCS);
		entityTransaction.commit();
		System.out.println("Updated successfully");
	}

	public void Fetch(int id) {
		CompanyTCS dbcompanyTCS = entityManager.find(CompanyTCS.class, id);
		System.out.println(dbcompanyTCS);

	}

	public void FetchAll() {
		Query query = entityManager.createQuery("Select c from CompanyTCS c");//It is an JPQL QUERY!
		List<CompanyTCS> list = query.getResultList();
		System.out.println(list);
	}

}
