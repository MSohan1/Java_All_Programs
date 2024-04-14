package corejava_solving_Qspiders;

import java.util.Scanner;

public class WhileProgs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int sum=0;

		int prod=1;
		while(num!=0)
		{
			int ld = num%10;
			sum+=ld;
			prod = prod*ld;
			num=num/10;
		}
		System.out.println("Sum of a number is: "+sum);
		
		System.out.println("Product of a number is: "+prod);
	}

}
