//HCF of two 2 Numbers
package corejava_solving_Qspiders;

import java.util.Scanner;

public class HCF_Of2Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		int hcf=0;
		for(int i=1;(i<=n1 && i<=n2);i++)
		{
			if((n1%i==0) && (n2%i==0))
			{
				hcf=i;
			}
		}
		System.out.println("HCF of "+n1+" and "+n2+" is : "+hcf);
		
		
		//LCM oF 2 Numbers
		int i=1;
		while(true)
		{
			if((n1*i)%n2==0)
			{
				System.out.println("LCM of "+n1+" and "+n2+" is : "+(n1*i));
				break;
			}
			i++;
		}
		
	}

}
