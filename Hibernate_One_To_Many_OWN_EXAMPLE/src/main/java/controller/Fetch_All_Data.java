package controller;

import dao.BusDao;
import dto.Bus;

public class Fetch_All_Data {

	public static void main(String[] args) {

		Bus bus = new Bus();
		
		
		BusDao busDao = new BusDao();
		busDao.Fetch_All(bus);
	}

}

