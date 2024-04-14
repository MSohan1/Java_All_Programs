package controller;

import java.util.Scanner;

import dao.CarDao;
import dto.Car;
import dto.Engine;

public class UpdateEngine {

	public static void main(String[] args) {

		Engine engine = new Engine();
		System.out.println("Enter all the details of Engine to update");
		
		
		//Taking car details from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Engine Id");
		int id = scanner.nextInt();
				
		
		System.out.println("Enter Engine details: ");
		System.out.println("Enter Engine HP: ");
		String engineHP = scanner.next();
		System.out.println("Enter Engine CC: ");
		String engineCC = scanner.next();
		System.out.println("Enter Engine Type: ");
		String engineType = scanner.next();
		
		engine.setEngineCC(engineCC);
		engine.setEngineHP(engineHP);
		engine.setEngineType(engineType);
		
		CarDao carDao = new CarDao();
		carDao.UpdateByEngine(engine, id);
	}

}
