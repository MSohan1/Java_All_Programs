package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.School;
import dto.Student;

public class StudentDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sohan");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insertData(Student student) {
		School school = student.getSchool();
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(school);
		entityTransaction.commit();
	}

	public void UpdateDataStudent(int id, Student student) {

		Student dbStudent = entityManager.find(Student.class, id);
		if (dbStudent != null) {
			School school = dbStudent.getSchool();
			student.setSchool(school);
			student.setStudentId(id);
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			System.out.println("Updated Successfully");
		}
	}

	public void UpdateDataSchool(int id, School school) {

		School dbSchool = entityManager.find(School.class, id);
		String Gst = school.getSchoolGst();
		if (dbSchool != null)
		{
			
			school.setSchoolId(id);
			school.setSchoolGst(Gst);
			school.setSchoolLoacation(dbSchool.getSchoolLoacation());
			school.setSchoolName(dbSchool.getSchoolName());
			entityTransaction.begin();
			entityManager.merge(school);
			entityTransaction.commit();
			System.out.println("Updated Successfully");
		}
	}

	public void FetchAll() {
		
		Query query = entityManager.createQuery("select s from Student s");
		List<Student> list = query.getResultList();
		
		System.out.println(list);
	}
	
	public void FetchById(int id, Student student) {
		
		Query query = entityManager.createQuery("select s from Student s where s.studentId=?1");
		query.setParameter(1, id);
		List<Student> list = query.getResultList();
		
		System.out.println(list);
	}
	
	public void DeleteData(int id,Student student)
	{
		Student newData = entityManager.find(Student.class, id);
		entityTransaction.begin();
		entityManager.remove(newData);
		entityTransaction.commit();
		System.out.println("Deleted Successfully");
	}
	
}
