package controller;

import dao.StudentDao;
import dto.Student;

public class Fetch {

	public static void main(String[] args) {

	Student student = new Student();
	StudentDao studentDao = new StudentDao();
	studentDao.FetchById(1,student);
	
	}

}
