package Controller;


import java.util.Scanner;

import Dao.CompanyTCS_Dao;
import Dto.CompanyTCS;

public class Update {

	public static void main(String[] args) {

		CompanyTCS companyTCS = new CompanyTCS();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the id for updation");
		int id = scanner.nextInt();
		
		System.out.println("Enter the Employee Designation");
		String Designation = scanner.next();
		
		System.out.println("Enter the Employee Name");
		String name = scanner.next();
		
		System.out.println("Enter the Employee Phone");
		long phone = scanner.nextLong();
		
		companyTCS.setEmployeeDesignation(Designation);
		companyTCS.setEmployeeephnnumber(phone);
		companyTCS.setEmployeeName(name);
		companyTCS.setEmpolyeeID(id);

	
		CompanyTCS_Dao companyTCS_Dao = new CompanyTCS_Dao();
		companyTCS_Dao.update(id, companyTCS);
	}

}