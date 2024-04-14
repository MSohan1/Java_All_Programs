package corejava_solving_Qspiders;

import java.util.Scanner;

public class NextPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int siralno = sc.nextInt();
		int sl=0;
		int prime=0;
		for(int i=0;sl<siralno;i++) {
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				prime=i;
				sl++;
			}
		}
		System.out.println(prime);

	}

}
