package controller;

import java.util.ArrayList;
import java.util.List;

import dao.StudentDao;
import dto.School;
import dto.Student;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student();
		student1.setStudentName("Sohan");
		student1.setStudentNumber(9347500901L);
		student1.setStudentAge(21);
		student1.setStudentAddress("HYD");

		Student student2 = new Student();
		student2.setStudentName("Krishna");
		student2.setStudentNumber(9347213901L);
		student2.setStudentAge(21);
		student2.setStudentAddress("USA");

		Student student3 = new Student();
		student3.setStudentName("Chanikya");
		student3.setStudentNumber(9312340901L);
		student3.setStudentAge(21);
		student3.setStudentAddress("Dubai");

		School school = new School();
		school.setSchoolName("NALLA NARSHIMHA REDDY GROUP OF INSTITUTIONS");
		school.setSchoolLoacation("HYD");
		school.setSchoolGst("FCFA45698745BBA");

		student1.setSchool(school);
		student2.setSchool(school);
		student3.setSchool(school);

	
		StudentDao studentDao = new StudentDao();
		studentDao.insertData(student1);
		studentDao.insertData(student2);
		studentDao.insertData(student3);
		
		
	}

}
