package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AaddharCard {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int AadherId;
	private long AadherNumber;
	private String AadherAuthority;
	
	@OneToOne
	private Person person;
	public int getAadherId() {
		return AadherId;
	}
	public void setAadherId(int aadherId) {
		AadherId = aadherId;
	}
	public long getAadherNumber() {
		return AadherNumber;
	}
	public void setAadherNumber(long aadherNumber) {
		AadherNumber = aadherNumber;
	}
	public String getAadherAuthority() {
		return AadherAuthority;
	}
	public void setAadherAuthority(String aadherAuthority) {
		AadherAuthority = aadherAuthority;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "AaddharCard [AadherId=" + AadherId + ", AadherNumber=" + AadherNumber + ", AadherAuthority="
				+ AadherAuthority + ", person=" + person + "]";
	}
	
		
}
