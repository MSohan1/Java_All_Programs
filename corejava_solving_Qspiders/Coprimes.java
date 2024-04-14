package corejava_solving_Qspiders;

import java.util.Scanner;

public class Coprimes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int hcf = 1;
		for(int i =1;i<=a&&i<=b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				hcf = i;
			}
		}
		if(hcf==1)
		{
			System.out.println("Given 2 Numbers "+a+","+b+" Coprime Numbers");
		}
		else
		{
			System.out.println("Given 2 Numbers "+a+","+b+" NotsCoprime Numbers");
		}
	}

}
