package corejava_solving_Qspiders;

import java.util.Scanner;

public class SqurilPlay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int temp=scanner.nextInt();
		boolean isSummer = scanner.nextBoolean();
		if(isSummer)
		{
			if(temp>=60&& temp<=100) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}	
		}
		else {
			if(temp>=60&& temp<=90) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		}

	}

}
