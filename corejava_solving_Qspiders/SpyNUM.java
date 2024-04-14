package corejava_solving_Qspiders;

import java.util.Scanner;

public class SpyNUM {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter A Number");
//		int num = sc.nextInt();
//		int remp=num;

		int sln=1;
		int ld=0;
		for (int num = 1; num <= 100; num++) {
			int temp = num;
			int sum = 0;
			int prod = 1;
			while (temp != 0) {
				ld = temp % 10;
				sum = sum + ld;
				prod *= ld;
				temp = temp / 10;
			}
			if (sum == prod) {
				System.out.println(sln + ")"+num + " is a Spy Number");
				sln++;
			}
		}
	}

}
