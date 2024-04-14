package controller;

import dao.CarDao;

public class FetchAll {

	public static void main(String[] args) {

		
		CarDao carDao = new CarDao();
		carDao.FetchAll();
		
	}

}
