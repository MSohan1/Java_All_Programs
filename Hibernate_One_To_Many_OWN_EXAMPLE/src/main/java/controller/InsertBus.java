package controller;

import dao.BusDao;
import dto.Bus;

public class InsertBus {

	public static void main(String[] args) {

		
		Bus bus = new Bus();
		bus.setBusName("TSRTC");
		bus.setBusNumber(107);
		bus.setBusSeats(50);
		bus.setBusType("Ordinary");
		
		
		BusDao busDao = new BusDao();
		busDao.InsertBus(bus);
	}

}
