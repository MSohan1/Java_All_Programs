package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bus {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int BusId;
	private String BusName;
	private int BusNumber;
	private int BusSeats;
	private String BusType;
	
	@OneToMany
	private List<Passengers>passengers ;//We are using list because  passengers will be many

	public int getBusId() {
		return BusId;
	}

	public void setBusId(int busId) {
		BusId = busId;
	}

	public String getBusName() {
		return BusName;
	}

	public void setBusName(String busName) {
		BusName = busName;
	}

	public int getBusNumber() {
		return BusNumber;
	}

	public void setBusNumber(int busNumber) {
		BusNumber = busNumber;
	}

	public int getBusSeats() {
		return BusSeats;
	}

	public void setBusSeats(int busSeats) {
		BusSeats = busSeats;
	}

	public String getBusType() {
		return BusType;
	}

	public void setBusType(String busType) {
		BusType = busType;
	}

	public List<Passengers> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passengers> passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return "Bus [BusId=" + BusId + ", BusName=" + BusName + ", BusNumber=" + BusNumber + ", BusSeats=" + BusSeats
				+ ", BusType=" + BusType + ", passengers=" + passengers + "]";
	}
	
	
	
	
	

}
