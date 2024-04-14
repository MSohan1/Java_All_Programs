package controller;

import java.util.Scanner;

import dao.CarDao;
import dto.Car;
import dto.Engine;

public class UpdateBoth {

	public static void main(String[] args) {


		Car car = new Car();
		System.out.println("Enter all the details to update");
		
		
		//Taking car details from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter car Id");
		int id = scanner.nextInt();
				
		
		System.out.println("Enter Car details: ");
		System.out.println("Enter Car Name: ");
		String carName = scanner.next();
		System.out.println("Enter Car Model: ");
		String carModel = scanner.next();
		System.out.println("Enter Car Color: ");
		String carColor = scanner.next();
		System.out.println("Enter Car Price: ");
		double carPrice = scanner.nextDouble();
		
		Engine engine = new Engine();
		System.out.println("Enter all the details of Engine to update");
		
		System.out.println("Enter Engine details: ");
		System.out.println("Enter Engine HP: ");
		String engineHP = scanner.next();
		System.out.println("Enter Engine CC: ");
		String engineCC = scanner.next();
		System.out.println("Enter Engine Type: ");
		String engineType = scanner.next();

		car.setCarColor(carColor);
		car.setCarModel(carModel);
		car.setCarName(carName);
		car.setCarPrice(carPrice);
		
		engine.setEngineCC(engineCC);
		engine.setEngineHP(engineHP);
		engine.setEngineType(engineType);

		car.setEngine(engine);
		CarDao carDao = new CarDao();
		carDao.UpdateByBoth(car,engine,id);
		

		
		
		


	}

}
