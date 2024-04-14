package Controller;

import Dao.CompanyTCS_Dao;

public class Fetch {

	public static void main(String[] args) {

		CompanyTCS_Dao companyTCS_Dao = new CompanyTCS_Dao();
		companyTCS_Dao.Fetch(2);
	}

}
