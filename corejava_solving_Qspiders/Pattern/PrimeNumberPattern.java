package corejava_solving_Qspiders.Pattern;

public class PrimeNumberPattern {

	public static void main(String[] args) {
		int prime = 10;
		
		
		for(int i =1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i>=j)
				{
					while(true)
					{
						prime++;
						int count=0;
						for(int a =1;a<=prime;a++)
						{
							if(prime%a==0)
							{
								count++;
							}
						}
						if(count==2)
						{
							System.out.print(" "+prime+" ");
							break;
						}
					}
				}
			}
			System.out.println("   ");
			}
			
		}

	}


