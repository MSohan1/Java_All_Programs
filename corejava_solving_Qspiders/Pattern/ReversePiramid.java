package corejava_solving_Qspiders.Pattern;

public class ReversePiramid {

	public static void main(String[] args) {
		int stars=1;
		int spaces=4;
		int rownum=9;
		for(int row=1;row<=rownum;row++)
		{
			for(int space=1;space<=spaces;space++)
			{
				System.out.print("   ");
			}
			for(int col=1;col<=stars;col++)
			{
				System.out.print(" * ");
			}
			if(row<=rownum/2)
			{
				stars++;
				spaces--;
			}
			else
			{
				stars--;
				spaces++;
			}
			System.out.println();
		}


	}

}
