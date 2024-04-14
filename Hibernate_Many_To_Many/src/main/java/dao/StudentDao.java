package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Courses;
import dto.Student;

public class StudentDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sohan");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insertData(Student student) {

		List<Courses> list = student.getCourses();

		entityTransaction.begin();

		for (Courses courses : list) {
			entityManager.persist(courses);
		}

		entityManager.persist(student);
		
		entityTransaction.commit();
	}

}
