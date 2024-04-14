package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.Trainer_dao;
import dto.Trainer;

public class UpdateData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter trainer ID for referance to update ");
		int id = scanner.nextInt();
		System.out.println("Enter trainer Salary to update ");
		double salary = scanner.nextDouble();
		

		Trainer trainer = new Trainer();
		trainer.setTrainerId(id);
		trainer.setTrainerSalary(salary);

		Trainer_dao trainerDao = new Trainer_dao();
		trainerDao.UpdateTrainer(trainer);


	}

}
