package Controller;


import java.util.Scanner;

import Dao.CompanyTCS_Dao;
import Dto.CompanyTCS;

public class Delete {

	public static void main(String[] args) {

		CompanyTCS dbCompanyTCS = new CompanyTCS();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id for deletion of data");
		int id = scanner.nextInt();
		
		CompanyTCS_Dao companyTCS_Dao = new CompanyTCS_Dao();
		companyTCS_Dao.delete(id);
		
	}

}
