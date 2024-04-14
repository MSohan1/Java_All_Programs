package corejava_solving_Qspiders.Pattern;

public class PascalPattern {

	public static void main(String[] args)
	{
		int spaces=4;
		int stars=1;
//		for(int row=1;row<=6;row++)
//		{
//			int x=1;
//			int nm=row-1;
//			int dm=1;
//			for(int space=1;space<=spaces;space++)
//			{
//				System.out.print(" ");
//			}
//			for(int a=1;a<=stars;a++)
//			{
//				System.out.print(x+" ");
//				x=(x*nm)/dm;         //formula-> x=(x*row-1)/a   (insted of row i am taking nu as numarator and dm as denominator insted of a)
//				nm--;
//				dm++;
//			}
//			spaces--;
//			stars++;
//			System.out.println();
//		}
		for(int row=1;row<=6;row++)
		{
			int x=1;
			int nm=row-1;
			int dm=1;
			for(int space=1;space<=spaces;space++)
			{
				System.out.print(" ");
			}
			for(int star=1;star<=stars;star++)
			{
				System.out.print(x+" ");
				x=(x*nm)/dm;
				nm--;
				dm++;
			}
			stars++;
			spaces--;
			System.out.println();
		}
		
	}
}
