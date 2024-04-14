package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int studentId;
private String studentName;
private String studentAddress;
private int studentAge;
private long studentNumber;

@ManyToOne
private School school;

public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public String getStudentAddress() {
	return studentAddress;
}

public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}

public int getStudentAge() {
	return studentAge;
}

public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
}

public long getStudentNumber() {
	return studentNumber;
}

public void setStudentNumber(long studentNumber) {
	this.studentNumber = studentNumber;
}

public School getSchool() {
	return school;
}

public void setSchool(School school) {
	this.school = school;
}

@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
			+ ", studentAge=" + studentAge + ", studentNumber=" + studentNumber + ", school=" + school + "]";
}


}
