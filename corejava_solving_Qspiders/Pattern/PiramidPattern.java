package corejava_solving_Qspiders.Pattern;

public class PiramidPattern {

	public static void main(String[] args) {
		
		int stars=1;
		int rownum=15;
		for(int row=1;row<=rownum;row++)
		{
			for(int col=1;col<=stars;col++)
			{
				System.out.print(" * ");
			}
			if(row<=rownum/2)
			{
				stars++;
			}
			else
			{
				stars--;
			}
			System.out.println();
		}

	}

}
