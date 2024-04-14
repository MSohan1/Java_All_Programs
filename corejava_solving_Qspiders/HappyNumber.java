package corejava_solving_Qspiders;

public class HappyNumber {

	public static void main(String[] args) {
		int n = 7;
		int temp=n;
		int prod;
		int sum=0;
		int happy=n;
		do {
			temp=happy;
			prod=1;
			sum=0;
			while(temp!=0)
				{
					prod = temp%10;
					sum+=prod*prod;
					temp = temp/10;	
				}
			happy=sum;
			System.out.println(happy);
			
		}while(happy>9);
		if(sum==1)
		{
			System.out.println("Happy Number");
		}
		else {
			System.out.println("Not a Happy Number");
		}
		

	}

}
