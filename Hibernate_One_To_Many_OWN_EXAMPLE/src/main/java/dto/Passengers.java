package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Passengers {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int passengerId;
	private String passengerName;
	private int passengerAge;
	private String passengerAddress;
	private Long passengerPhone;
	private String passengerGender;
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public String getPassengerAddress() {
		return passengerAddress;
	}
	public void setPassengerAddress(String passengerAddress) {
		this.passengerAddress = passengerAddress;
	}
	public Long getPassengerPhone() {
		return passengerPhone;
	}
	public void setPassengerPhone(Long passengerPhone) {
		this.passengerPhone = passengerPhone;
	}
	public String getPassengerGender() {
		return passengerGender;
	}
	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}
	@Override
	public String toString() {
		return "Passengers [passengerId=" + passengerId + ", passengerName=" + passengerName + ", passengerAge="
				+ passengerAge + ", passengerAddress=" + passengerAddress + ", passengerPhone=" + passengerPhone
				+ ", passengerGender=" + passengerGender + "]";
	}
	
	
	
	
	
}
