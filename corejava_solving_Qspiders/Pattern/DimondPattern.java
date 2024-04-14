package corejava_solving_Qspiders.Pattern;

public class DimondPattern {

	public static void main(String[] args) {

		int stars=1;
		int spaces =4;
		for(int row = 1;row<=9;row++)
		{
			for(int space=1;space<=spaces;space++)
			{
				System.out.print("   ");
			}
			for(int col=1;col<=stars;col++)
			{
				System.out.print(" * ");
			}
			
			
			if(row<=4)
			{
				stars+=2;
				spaces--;
			}
			else
			{
					stars-=2;
					spaces++;
				
			}
			System.out.println();
		}

	}

}
