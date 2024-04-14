package controller;

import dao.StudentDao;
import dto.Student;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		StudentDao studentDao = new StudentDao();
		
		studentDao.DeleteData(6, student);

	}
	
}
