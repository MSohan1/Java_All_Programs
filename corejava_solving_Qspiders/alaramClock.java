package corejava_solving_Qspiders;

import java.util.Scanner;

public class alaramClock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		boolean isvacation = scanner.nextBoolean();
		if((days>= 0 && days<=5)&& isvacation==false)
		{
			System.out.println("Alaram = 7:00");
		}
		else if((days<= 0 && days<=5)&& isvacation)
		{
			System.out.println("Alaram= 10:00");
		}
		else if((days>=6)&& isvacation==false)
		{
			System.out.println("Alaram = 10:00");
		}
		else {
			System.out.println("Alaram is off");
		}

	}

}
