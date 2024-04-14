package controller;

import java.util.ArrayList;
import java.util.List;

import dao.StudentDao;
import dto.Courses;
import dto.Student;

public class InsertData {

	public static void main(String[] args) {

		Courses course1 = new Courses();
		course1.setCourseName("Java");
		course1.setCourseDuration(90);
		course1.setCoursefee(30000);
		course1.setCourseType("OFF-LINE");

		Courses course2 = new Courses();
		course2.setCourseName("WEB-TECHNOLOGIES");
		course2.setCourseDuration(120);
		course2.setCoursefee(30000);
		course2.setCourseType("ON-LINE");

		Courses course3 = new Courses();
		course3.setCourseName("ADVANCE-JAVA");
		course3.setCourseDuration(60);
		course3.setCoursefee(35000);
		course3.setCourseType("OFF-LINE");

		Courses course4 = new Courses();
		course4.setCourseName("PYTON");
		course4.setCourseDuration(160);
		course4.setCoursefee(35000);
		course4.setCourseType("OFF-LINE");

		Courses course5 = new Courses();
		course5.setCourseName("SQL");
		course5.setCourseDuration(30);
		course5.setCoursefee(35000);
		course5.setCourseType("OFF-LINE");

		List<Courses> Java_Developer = new ArrayList<Courses>();
		Java_Developer.add(course5);
		Java_Developer.add(course3);
		Java_Developer.add(course1);

		List<Courses> Web_Developer = new ArrayList<Courses>();
		Web_Developer.add(course2);
		Web_Developer.add(course5);

		List<Courses> Python_Developer = new ArrayList<Courses>();
		Python_Developer.add(course4);

		Student student1 = new Student();
		student1.setStudentName("Sohan");
		student1.setStudentGender("Male");
		student1.setStudentPhone(321456987L);
		student1.setStudentAge(21);

		Student student2 = new Student();
		student2.setStudentName("Krishna");
		student2.setStudentGender("Male");
		student2.setStudentPhone(963852741L);
		student2.setStudentAge(21);

		Student student3 = new Student();
		student3.setStudentName("Radha");
		student3.setStudentGender("Female");
		student3.setStudentPhone(32145699856L);
		student3.setStudentAge(20);

		student1.setCourses(Java_Developer);
		student2.setCourses(Python_Developer);
		student3.setCourses(Web_Developer);

		StudentDao studentDao = new StudentDao();
		studentDao.insertData(student1);
		studentDao.insertData(student2);
		studentDao.insertData(student3);

	}

}
