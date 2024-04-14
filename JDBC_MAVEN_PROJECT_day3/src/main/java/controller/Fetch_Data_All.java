package controller;

import java.sql.SQLException;

import dao.Trainer_dao;
import dto.Trainer;

public class Fetch_Data_All {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Trainer trainer = new Trainer();
		
		
		Trainer_dao trainerDao = new Trainer_dao();
		trainerDao.FetchAll(trainer);
	}

}
