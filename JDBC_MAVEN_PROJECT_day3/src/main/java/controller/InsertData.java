package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.Trainer_dao;
import dto.Trainer;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Trainer Id :");
		int id= scanner.nextInt();
		System.out.println("Enter Trainer Name :");
		String name= scanner.next();
		System.out.println("Enter Trainer Skills :");
		String skill = scanner.next();
		System.out.println("Enter Trainer Address :");
		String address = scanner.next();
		System.out.println("Enter Trainer Salary :");
		double salary = scanner.nextDouble();
		System.out.println("Enter Trainer Phone :");
		long phone = scanner.nextLong();
		
		
		
		Trainer trainer = new Trainer();
		
		
		trainer.setTrainerId(id);
		trainer.setTrainerName(name);
		trainer.setTrainerSkill(skill);
		trainer.setTrainerAddress(address);
		trainer.setTrainerSalary(salary);
		trainer.setTrainerPhone(phone);
		
		
		Trainer_dao trainerDao = new Trainer_dao();
		
		
		trainerDao.insertTrainer(trainer);
	}

	}

