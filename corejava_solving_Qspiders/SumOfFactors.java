package corejava_solving_Qspiders;

public class SumOfFactors {

	public static void main(String[] args) {
		int num=345;
		int sum=0;
		int fact=1;
		int ans=0;
		while(num!=0)
		{
			sum = num%10;
			
			for(int i=1;i<=sum;i++)
			{
				fact=fact*i;

			}
			ans=ans+fact;
			num=num/10;
			fact=1;
			
	}

System.out.println(ans);
	}


}
