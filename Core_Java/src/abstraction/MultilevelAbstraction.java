package abstraction;

abstract class A
{
	abstract public void msg();
	abstract public void call();
}
abstract class B extends A
{
	public void msg()
	{
		System.out.println("Message your Friend");
	}

	
}
class C extends B
{
	public void call()
	{
		System.out.println("Call Your Friend");
	}
	public void whatToDo()
	{
		msg();
		call();
	}
}



public class MultilevelAbstraction {

	public static void main(String[] args)
	{
		C c = new C();
		c.whatToDo();

	}

}
