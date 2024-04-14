package corejava_solving_Qspiders;

public class BasicPatternProg {

	public static void main(String[] args) {
		
		for(int rows = 1;rows<=5;rows++)
		{
			for(int col=1;col<=5;col++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
//output for above program
//		 *  *  *  *  * 
//		 *  *  *  *  * 
//		 *  *  *  *  *
//		 *  *  *  *  * 
//		 *  *  *  *  * 
//---------------------------------------------------------------------

		
		for(int rows = 1;rows<=5;rows++)
		{
			for(int col=1;col<=5;col++)
			{
				if(rows==2 && col ==3)
				{
					System.out.print(" @ ");
				}
				else
				{
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
//		output for above program

//		 *  *  *  *  * 
//		 *  *  @  *  * 
//		 *  *  *  *  * 
//		 *  *  *  *  * 
//		 *  *  *  *  *
		
		//---------------------------------------------------------------------
		
		
		for(int rows = 1;rows<=5;rows++)
		{
			for(int col=1;col<=5;col++)
			{
				if(rows==3 && col ==1)
				{
					System.out.print(" @ ");
				}
				else if(rows==4 && col ==4)
				{
					System.out.print(" # ");
				}
				else {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
		
// output for above program	
//		 *  *  *  *  * 
//		 *  *  *  *  * 
//		 @  *  *  *  * 
//		 *  *  *  #  * 
//		 *  *  *  *  * 
		//---------------------------------------------------------------------
	
	
		for(int row=1;row<=5;row++) 
		{

		for(int col=1;col<=5;col++)
		{
			System.out.print(" "+row+" ");
		}
		System.out.println();
	}
//	Output for above program
//	 1  1  1  1  1 
//	 2  2  2  2  2 
//	 3  3  3  3  3 
//	 4  4  4  4  4 
//	 5  5  5  5  5 
	//---------------------------------------------------------------------
	
		
		for(int row=1;row<=5;row++) 
		{

		for(int col=1;col<=5;col++)
		{
			System.out.print(" "+col+" ");
		}
		System.out.println();
	}
//	Output for above program
//	 1  2  3  4  5 
//	 1  2  3  4  5 
//	 1  2  3  4  5 
//	 1  2  3  4  5 
//	 1  2  3  4  5 
	//---------------------------------------------------------------------
	
	
		for(int row=5;row>=1;row--) 
		{

		for(int col=1;col<=5;col++)
		{
			System.out.print(" "+row+" ");
		}
		System.out.println();
	}
//	Output for above program
//	 5  5  5  5  5 
//	 4  4  4  4  4 
//	 3  3  3  3  3 
//	 2  2  2  2  2 
//	 1  1  1  1  1 
	//---------------------------------------------------------------------
	

		for(int row=1;row<=5;row++) 
		{

		for(int col=5;col>=1;col--)
		{
			System.out.print(" "+col+" ");
		}
		System.out.println();
	}
//	Output for above program
//	 5  4  3  2  1 
//	 5  4  3  2  1 
//	 5  4  3  2  1 
//	 5  4  3  2  1 
//	 5  4  3  2  1 
	//---------------------------------------------------------------------
	
	
		int count=10;
		for(int row=1;row<=5;row++) 
		{

		for(int col=5;col>=1;col--)
		{
			System.out.print(" "+count+" ");
			count++;
		}
		System.out.println();
	}
//	Output for above program
//	 10  11  12  13  14 
//	 15  16  17  18  19 
//	 20  21  22  23  24 
//	 25  26  27  28  29 
//	 30  31  32  33  34 

	count =65;//Making count as 65 to conver it into charecter
	
	
		for(int row=1;row<=5;row++) 
		{
		for(int col=5;col>=1;col--)
		{
			System.out.print(" "+(char)count+" ");
			count++;
		}
		System.out.println();
	}
//	Output for above program
//	 A  B  C  D  E 
//	 F  G  H  I  J 
//	 K  L  M  N  O 
//	 P  Q  R  S  T 
//	 U  V  W  X  Y 
		
		//------------------------------------------------------------
	for(int row = 1;row<=5;row++)
	{
		for(int col=1;col<=5;col++)
		{
			if(row==col)
			{
				System.out.print(" * ");
			}
			else
			{
				System.out.print("   ");
			}
		}
		System.out.println();
	}
	
	// output
//	 *             
//	    *          
//	       *       
//	          *    
//	             * 

	for(int row = 1;row<=5;row++)
	{
		for(int col=1;col<=5;col++)
		{
			if(row+col==6)
			{
				System.out.print(" * ");
			}
			else
			{
				System.out.print("   ");
			}
		}
		System.out.println();
	}
		
	System.out.println("-------------------------------------");
	
	for(int row = 1;row<=7;row++)
	{
		for(int col=1;col<=7;col++)
		{
			if(row==col||row+col==8)
			{
				System.out.print(" * ");
			}
			else {
				System.out.print("   ");
			}
		}
		System.out.println();
	}
	
	
	}
}
