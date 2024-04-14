package corejava_solving_Qspiders.Pattern;

public class RhombusPattern {

	public static void main(String[] args) {
		int stars=9;int spaces=0;
		for(int row=1;row<=9;row++)
		{
			for(int space=1;space<=spaces;space++)
			{
				System.out.print("   ");
			}
			for(int star=1;star<=stars;star++)
			{
				System.out.print(" * ");
			}
			if(row<=4)
			{
				stars-=2;
				spaces++;		
			}
			else
			{
				stars+=2;
				spaces--;
			}
			System.out.println();
			
		}
	}

}
