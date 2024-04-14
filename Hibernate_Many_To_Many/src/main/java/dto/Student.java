package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int StudentId;
	private String StudentName;
	private int StudentAge;
	private String StudentGender;
	private long StudentPhone;
	
	@ManyToMany
	private List<Courses>courses;

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getStudentAge() {
		return StudentAge;
	}

	public void setStudentAge(int studentAge) {
		StudentAge = studentAge;
	}

	public String getStudentGender() {
		return StudentGender;
	}

	public void setStudentGender(String studentGender) {
		StudentGender = studentGender;
	}

	public long getStudentPhone() {
		return StudentPhone;
	}

	public void setStudentPhone(long studentPhone) {
		StudentPhone = studentPhone;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentAge=" + StudentAge
				+ ", StudentGender=" + StudentGender + ", StudentPhone=" + StudentPhone + ", courses=" + courses + "]";
	}
	
	
	
}
