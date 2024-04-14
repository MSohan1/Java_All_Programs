package controller;

import dao.BusDao;
import dto.Bus;

public class Fetch_Data_Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bus bus = new Bus();
		
		BusDao busDao = new BusDao();
		busDao.Fetch_Single(1, bus);

	}

}
