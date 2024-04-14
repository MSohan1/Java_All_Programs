package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class School {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int SchoolId;
	
	private String schoolName;
	private String schoolGst;
 	private String schoolLoacation;
	public int getSchoolId() {
		return SchoolId;
	}
	public void setSchoolId(int schoolId) {
		SchoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolGst() {
		return schoolGst;
	}
	public void setSchoolGst(String schoolGst) {
		this.schoolGst = schoolGst;
	}
	public String getSchoolLoacation() {
		return schoolLoacation;
	}
	public void setSchoolLoacation(String schoolLoacation) {
		this.schoolLoacation = schoolLoacation;
	}
	@Override
	public String toString() {
		return "School [SchoolId=" + SchoolId + ", schoolName=" + schoolName + ", schoolGst=" + schoolGst
				+ ", schoolLoacation=" + schoolLoacation + "]";
	}
 	
	
}
