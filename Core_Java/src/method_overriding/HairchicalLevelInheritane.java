package method_overriding;
class Company{
	public void accountent()
	{
		System.out.println("Manages Money");
	}
}
class Clinte extends Company{
	public void accountent()
	{
		System.out.println("Clinte Pays money to Company");
	}
}
class Market extends Company{
	
}
class Employee extends Company{
	public void accountent()
	{
		System.out.println("Employee Recives money to Company");
	}
}


public class HairchicalLevelInheritane {

	public static void main(String[] args) {
		Clinte clinte = new Clinte();
		Employee employee = new Employee();
		Market market = new Market();
		clinte.accountent();
		market.accountent();
		employee.accountent();
		
	}

}
