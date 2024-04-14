package corejava_solving_Qspiders;

public class SpnicNumbers {

	public static void main(String[] args) {
		
		int num = 41;
		int prod=1,x=0;
		for(int i=1 ;i<=num;i++)
		{
			
			if(num%i==0)
			{
				int count = 0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					prod = prod*i;
					x++;
				}
			}
		
		}
		System.out.println(x);
		if(x==3)
		{
			System.out.println(x);
			System.out.println("it is a sphinec number");
		}
		else {
			System.out.println("it is not a sphinec number");
		}

	}

}
