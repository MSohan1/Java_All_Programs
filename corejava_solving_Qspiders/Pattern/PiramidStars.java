package corejava_solving_Qspiders.Pattern;

public class PiramidStars {

	public static void main(String[] args) {
		int space=4;int star=1;
		for(int row = 1;row<=5;row++)
		{
				for(int a = 1;a<=space;a++)
				{
					System.out.print(" ");
				}
				for(int b=1;b<=star;b++)
				{
					System.out.print("*");
				}
			System.out.println("   ");
			space--;
			star+=2;
		}
		  
		System.out.println("-----------------------------");
		space=0;star=9;
		
		for(int row = 1;row<=5;row++)
		{
				for(int a = 1;a<=space;a++)
				{
					System.out.print(" ");
				}
				for(int b=1;b<=star;b++)
				{
					System.out.print("*");
				}
			System.out.println("   ");
			space++;
			star-=2;
		}
		
		
				
		

	}

}
