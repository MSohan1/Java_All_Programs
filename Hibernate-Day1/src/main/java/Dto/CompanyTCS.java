package Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompanyTCS {
	@Id
	private int EmpolyeeID;
	private String EmployeeName;
	private String EmployeeDesignation;
	private long Employeeephnnumber;

	public int getEmpolyeeID() {
		return EmpolyeeID;
	}

	public void setEmpolyeeID(int empolyeeID) {
		EmpolyeeID = empolyeeID;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return EmployeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		EmployeeDesignation = employeeDesignation;
	}

	public long getEmployeeephnnumber() {
		return Employeeephnnumber;
	}

	public void setEmployeeephnnumber(long employeeephnnumber) {
		Employeeephnnumber = employeeephnnumber;
	}

	@Override
	public String toString() {
		return "CompanyTCS [EmpolyeeID=" + EmpolyeeID + ", EmployeeName=" + EmployeeName + ", EmployeeDesignation="
				+ EmployeeDesignation + ", Employeeephnnumber=" + Employeeephnnumber + ", getEmpolyeeID()="
				+ getEmpolyeeID() + ", getEmployeeName()=" + getEmployeeName() + ", getEmployeeDesignation()="
				+ getEmployeeDesignation() + ", getEmployeeephnnumber()=" + getEmployeeephnnumber() + "]";
	}

}
