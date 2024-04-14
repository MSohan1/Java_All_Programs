package controller;

import java.util.Scanner;

import dao.CarDao;
import dto.Car;
import dto.Engine;

public class InsertData {

	public static void main(String[] args) {

		Car car = new Car();
		Engine engine = new Engine();
		
		//Taking car details from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Car details: ");
		System.out.println("Enter Car Name: ");
		String carName = scanner.next();
		System.out.println("Enter Car Model: ");
		String carModel = scanner.next();
		System.out.println("Enter Car Color: ");
		String carColor = scanner.next();
		System.out.println("Enter Car Price: ");
		double carPrice = scanner.nextDouble();
		
		
		//Taking Engine Details from user
		
		System.out.println("Enter Engine details: ");
		System.out.println("Enter Engine Horse Power: ");
		String engineHp = scanner.next();
		System.out.println("Enter Engine CC: ");
		String enginecc = scanner.next();
		System.out.println("Enter Engine Type: ");
		String engineType = scanner.next();
		
		
		//setting the values using setters
		car.setCarColor(carColor);
		car.setCarModel(carModel);
		car.setCarName(carName);
		car.setCarPrice(carPrice);
		car.setEngine(engine);
		
		//setting the values using setters
		engine.setEngineCC(enginecc);
		engine.setEngineHP(engineHp);
		engine.setEngineType(engineType);
		
		CarDao carDao = new CarDao();
		carDao.InsertData(car);
		
	}

}
