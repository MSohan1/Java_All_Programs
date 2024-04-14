package corejava_solving_Qspiders;

public class MethodExample {

	public static void run()
	{
		System.out.println("Running");
	}
	public static void sing() {
		System.out.println("Singing");
	}
	public static void add(int a,int b)
	{
		System.out.println("Addition of 2 Numbers is: "+(a+b));
	}
	public static void reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			rev = rev*10+(num%10);
			num/=10;
		}
		System.out.println("Reverse of a Number is: "+rev);

	}
	public static void details(String name,int age,char gender)
	{
		System.out.println("Name : "+name+"\n"+"Age : "+age+"\n"+"Gender : "+gender);
	}
	public static void main(String args[]) {

		System.out.println("Main Method Starts");
		run();
		sing();
		add(5,8);
		reverse(456987);
		details("Sohan",23,'M');
		System.out.println("Main Method Ends");
		
	}
}
