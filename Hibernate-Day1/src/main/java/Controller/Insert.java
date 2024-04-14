package Controller;


import java.util.Scanner;

import Dao.CompanyTCS_Dao;
import Dto.CompanyTCS;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		CompanyTCS companyTCS = new CompanyTCS();
		
		System.out.println("Enter Employee details");
		
		System.out.println("Enter Employee ID");
		int id = scanner.nextInt();
		System.out.println("Enter Employee Name");
		String name = scanner.next();
		System.out.println("Enter Employee Designation");
		String designation = scanner.next();
		System.out.println("Enter Employee Phone");
		long phn = scanner.nextLong();
		
		companyTCS.setEmpolyeeID(id);
		companyTCS.setEmployeeName(name);
		companyTCS.setEmployeeDesignation(designation);
		companyTCS.setEmployeeephnnumber(phn);
		
		CompanyTCS_Dao companyTCS_Dao = new CompanyTCS_Dao();
		
		companyTCS_Dao.InsertData(companyTCS);
		
		System.out.println("Inserted Successfully");
		
	}

}

