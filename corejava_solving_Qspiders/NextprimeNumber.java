package corejava_solving_Qspiders;

import java.util.Scanner;

public class NextprimeNumber {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter an number");
		int num = scanner.nextInt();
		
		int countnextnum=0;
		
		int nextnum=0;
		
		for(int i=num+1;countnextnum<2;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				nextnum=i;
				
				break;
				
				
			}
			
		}
		System.out.println("The next Prime Number of the given number "+num+" is : "+nextnum);

		
		//Easy Way To print Next Prime Numbers
		
//		for(;true;)
//		{
//			num++;
//			int count=0;
//			for(int i=1;i<num;i++) {
//				if(num%i==0)
//				{
//					count++;
//				}
//				
//			}
//			if(count==2)
//			{
//				System.out.println("Next Num is "+num);
//				break;
//			}
//		}
//		
		
		//Easy Way To print Previous Prime Numbers
		
//		for(;true;)
//		{
//			num--;
//			int count=0;
//			for(int i=1;i<=num;i++) {
//				if(num%i==0)
//				{
//					count++;
//				}
//				
//			}
//			if(count==2)
//			{
//				System.out.println("Previous Num is "+num);
//				break;
//			}
//		}
//
//		
	}

}
