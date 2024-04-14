package methodoverloading;

public class OverLoad_NonStatic {

	public void test(boolean b)
	{
		System.out.println("Boolean b = "+b);
		System.out.println("--------------------------------------------------");
	}
	public static void test(int a,int b)//over loading using static method for non static method 
	{
		System.out.println(a+b);
	}
	public void test(double d1,double d2)
	{
		System.out.println("Double d1 = "+d1);
		System.out.println("Double d2 = "+d2);
		System.out.println("--------------------------------------------------");
	}
	public void test(int age,int b,String name)
	{
		System.out.println("Age = "+age);
		System.out.println("Roll_Num = "+b);
		System.out.println("Name = "+name);
		System.out.println("--------------------------------------------------");
	}
	
	public static void main(String[] args) {
		
		OverLoad_NonStatic overLoad = new OverLoad_NonStatic();
		overLoad.test(false);
		overLoad.test(71.54,81.54);
		overLoad.test(18,81,"sohan");
		overLoad.test(5, 8);
	}

}
