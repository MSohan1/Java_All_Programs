package method_overriding;


abstract class School
{
	public void environment()
	{ 
		System.out.println("School provides InfraStructure");
	}
	public void fee()
	{
		System.out.println("School collects Fee");
	}
	public void exams()
	{
		System.out.println("School conducts Exam");
	}

}

class Faculty extends School
{
	public void environment()
	{
		System.out.println("Faculty Utilizes the InfraStructure");
	}
}
class Student extends Faculty
{
	public void exams()
	{
		System.out.println("Students write the Exam");
	}
	public void getExamResults()
	{
		System.out.println("Students Students gets the results");
		environment();
		fee();
		exams();
	}
	
	
}

public class Example_1 {

	
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.getExamResults();

	}

}
