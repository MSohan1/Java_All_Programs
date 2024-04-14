package controller;

import java.util.Scanner;

import dao.StudentDao;
import dto.Student;

public class UpdateData {

	public static void main(String[] args) {

	Student student = new Student();
	
	
	Scanner scanner = new Scanner(System.in); 
	System.out.println("Enter the id of a Student");
	int id = scanner.nextInt();
	System.out.println("Enter Student Name");
	String name = scanner.next(); 
	System.out.println("Enter Student Age");
	int age = scanner.nextInt();
	System.out.println("Enter Student Phone Number");
	long phone=scanner.nextLong();
	System.out.println("Enter Student Address");
	String address = scanner.next();
	
	
	student.setStudentId(id);
	student.setStudentAddress(address);
	student.setStudentAge(age);
	student.setStudentName(name);
	student.setStudentNumber(phone);
	
	
	
	StudentDao studentDao = new StudentDao();
	studentDao.UpdateDataStudent(id, student);
	}

}
