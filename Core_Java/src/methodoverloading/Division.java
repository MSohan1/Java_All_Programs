//OverLoad by using static and non Static methods

package methodoverloading;

public class Division {
	public static void div(int num1,int num2){
		System.out.println("The reminder of numbers "+num1+" % "+num2+" = "+ (num1%num2));
	}
	public  void div(double num1,double num2){
		System.out.println("The qoutent of numbers "+num1+" / "+num2+" = "+ (num1/num2));
	}
	public static void main(String[] args) {
		Division div = new Division();
		div.div(15, 10);
		div.div(45, 5.3);

	}

}
