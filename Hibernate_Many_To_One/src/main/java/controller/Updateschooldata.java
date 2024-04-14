package controller;

import dao.StudentDao;
import dto.School;

public class Updateschooldata {

	public static void main(String[] args) {

		School school = new School();
		school.setSchoolGst("FCFA789654125BBF");
		school.setSchoolId(1);
		
		StudentDao studentDao = new StudentDao();
		studentDao.UpdateDataSchool(2, school);
	}

}
