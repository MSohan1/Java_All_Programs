package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.Trainer_dao;
import dto.Trainer;

public class DeleteData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter trainer ID to delete ");
		int id = scanner.nextInt();
		
		
		Trainer trainer = new Trainer();
		trainer.setTrainerId(id);
		
		
		Trainer_dao trainerDao = new Trainer_dao();
		trainerDao.deleteTrainer(trainer);
		
	}

}
