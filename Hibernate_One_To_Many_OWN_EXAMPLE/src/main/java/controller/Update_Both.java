package controller;

import java.util.ArrayList;
import java.util.List;

import dao.BusDao;
import dto.Bus;
import dto.Passengers;

public class Update_Both {

	public static void main(String[] args) {

		
		Passengers passengers1 = new Passengers();
		passengers1.setPassengerName("M.Sohan");
		passengers1.setPassengerAge(20);
		passengers1.setPassengerAddress("Hyd");
		passengers1.setPassengerGender("Male");
		passengers1.setPassengerPhone(321456987L);
		
		Passengers passengers2 = new Passengers();
		passengers2.setPassengerName("M.Vinay");
		passengers2.setPassengerAge(30);
		passengers2.setPassengerAddress("Medak");
		passengers2.setPassengerGender("Male");
		passengers2.setPassengerPhone(987456321L);
		
		Passengers passengers3 = new Passengers();
		passengers3.setPassengerName("M.Rishitha");
		passengers3.setPassengerAge(50);
		passengers3.setPassengerAddress("Nalagonda");
		passengers3.setPassengerGender("Female");
		passengers3.setPassengerPhone(987456321L);
		
		
		List<Passengers> list=new  ArrayList<Passengers>();
		list.add(passengers1);
		list.add(passengers2);
		list.add(passengers3);
		
		Bus bus = new Bus();
		bus.setBusName("BLRSRTC");
		bus.setBusNumber(118);
		bus.setBusSeats(75);
		bus.setBusType("Metro");
		bus.setPassengers(list);
		
		BusDao busDao = new BusDao();
		busDao.Update_Both(1,bus);

	}

}
