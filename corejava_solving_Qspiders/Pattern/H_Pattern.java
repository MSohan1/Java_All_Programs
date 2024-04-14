package corejava_solving_Qspiders.Pattern;

public class H_Pattern {

	public static void main(String[] args) {
		int stars=1;
		int spaces=8;
		for(int row=1;row<=9;row++)
		{
			for(int a=1;a<=stars;a++)
			{
				System.out.print(" * ");
			}
			for(int b=1;b<=spaces;b++)
			{
				System.out.print("   ");
			}
			for(int a=1;a<=stars;a++)
			{
				System.out.print(" * ");
			}
			if(row<=4)
			{
				spaces-=2;
				stars++;
			}
			else
			{
				spaces+=2;
				stars--;
			}
			System.out.println();
		}

	}

}
