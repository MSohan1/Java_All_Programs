package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int studentId;
	private String studentName;
	private int studentClass;
	private char studentSection;
	private double studentOverAll;

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

	public int getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}

	public char getStudentSection() {
		return studentSection;
	}

	public void setStudentSection(char studentSection) {
		this.studentSection = studentSection;
	}

	public double getStudentOverAll() {
		return studentOverAll;
	}

	public void setStudentOverAll(double studentOverAll) {
		this.studentOverAll = studentOverAll;
	}

	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", studentName=" + studentName + ", studentClass="
				+ studentClass + ", studentSection=" + studentSection + ", studentOverAll=" + studentOverAll + "]";
	}


}
