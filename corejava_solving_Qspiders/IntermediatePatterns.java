package corejava_solving_Qspiders;

public class IntermediatePatterns {

	public static void main(String[] args) {
		
		for(int row = 1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(row==1||row==5||row==col)
				{
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("---------------------------");
		
		
		
		for(int row = 1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(row==1||row==5||row+col==6)
				{
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("----------------------------");
		
		
		for(int row = 1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(col==1||col==5||row+col==6)
				{
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		
		for(int row = 1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(col==1||col==5||row==col)
				{
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------");
		
		for(int row = 1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(row==1||row==5||col==1||col==5)
				{
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("---------------------------------------------");
		
		for(int row = 1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==1||row==7||row==col||row+col==8||col==1||col==7)
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
