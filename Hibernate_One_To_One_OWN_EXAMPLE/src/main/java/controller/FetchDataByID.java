package controller;

import java.util.Scanner;

import dao.CarDao;

public class FetchDataByID {

	public static void main(String[] args) {

		System.out.println("Enter carID to fetch the results");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		
		CarDao carDao = new CarDao();
		carDao.FetchbyId(id);
		
	}

}
