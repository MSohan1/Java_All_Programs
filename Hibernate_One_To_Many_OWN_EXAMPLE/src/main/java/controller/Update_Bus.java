package controller;

import dao.BusDao;
import dto.Bus;

public class Update_Bus {

	public static void main(String[] args) {

		
		Bus bus = new Bus();
		bus.setBusName("TSRTC");
		bus.setBusNumber(86);
		bus.setBusSeats(50);
		bus.setBusType("Ordinary");
		

		BusDao busDao = new BusDao();
		busDao.Update_Bus(2,bus);
	}

}
