package corejava_solving_Qspiders.Pattern;

public class PiramidwithSpaces {

	public static void main(String[] args) {
		
		int stars=1;
		int spaces=4;
		for(int row=1;row<=5;row++)
		{
			for(int a=1;a<=spaces;a++)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=stars;b++)
			{
				System.out.print("* ");
			}
			stars++;
			spaces--;
			System.out.println();
		}

	}

}
