package corejava_solving_Qspiders;

import java.util.Scanner;

public class CaughtSpeeding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int speed = scanner.nextInt();
		boolean isBisrthday = scanner.nextBoolean();
		int ticket = 0;
		if(isBisrthday)
		{
			if(speed<=60+5)
			{
				ticket=0;
			}
			else if(speed>60+5&&speed<=80+5)
			{
				ticket=1;
			}
			else
			{
				ticket=2;
			}
		}
		else {
			if(speed<=60)
			{
				ticket=0;
			}
			else if(speed>60&&speed<=80)
			{
				ticket=1;
			}
			else
			{
				ticket=2;
			}
		}
		System.out.println("Your Ticket is:"+ticket);
	}

}
