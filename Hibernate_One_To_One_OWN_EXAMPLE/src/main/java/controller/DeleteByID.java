package controller;

import java.util.Scanner;

import dao.CarDao;

public class DeleteByID {

	public static void main(String[] args) {

		System.out.println("Enter carid to delete the data");
		Scanner scanner = new Scanner(System.in);
		int id =scanner.nextInt();
		 
		
		CarDao carDao = new CarDao();
		carDao.DeleteData(id);
	}

}
