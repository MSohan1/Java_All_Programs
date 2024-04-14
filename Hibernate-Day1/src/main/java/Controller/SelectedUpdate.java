package Controller;


import java.util.Scanner;

import Dao.CompanyTCS_Dao;
import Dto.CompanyTCS;

public class SelectedUpdate {

	public static void main(String[] args) {

		CompanyTCS companyTCS = new CompanyTCS();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the id for updation");
		int id = scanner.nextInt();
		
		System.out.println("Enter the Employee Phone");
		long phone = scanner.nextLong();
		
		companyTCS.setEmployeeephnnumber(phone);
		companyTCS.setEmpolyeeID(id);

	
		CompanyTCS_Dao companyTCS_Dao = new CompanyTCS_Dao();
		companyTCS_Dao.UpdatePhone(id, phone);

	}

}

