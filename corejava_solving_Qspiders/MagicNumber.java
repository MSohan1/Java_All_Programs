package corejava_solving_Qspiders;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 14;
		int sum = 0;
		int temp = num;
		int happy=0;
//Using Single Loop timeComplexity is O(n)		
		while (temp != 0 || sum > 9)
		{
			if (temp == 0)
			{
				temp = sum;
				sum = 0;
			}
			int ld = temp % 10;
			sum += ld;
			temp /= 10;
		}
		if (sum == 1) 
		{
			System.out.println("Happy Number");
		}
		else 
		{
			System.out.println("Not a Happy Number");
		}

		
		
		
		
		
//using 2 loops time Complexity is O(N^2)		
		temp=num;
		do
		{
			
			sum = 0;
			while(temp!=0)
			{
				int ld = temp%10;
				sum +=ld;
				temp /=10;
			}
			happy = sum;
			temp = happy;
//			System.out.println(happy);
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
