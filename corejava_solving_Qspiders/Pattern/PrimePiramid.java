package corejava_solving_Qspiders.Pattern;

public class PrimePiramid {

	public static void main(String[] args) {
		int space=4;int star=1;int x=1;
		for(int row = 1;row<=5;row++)
		{
				for(int a = 1;a<=space;a++)
				{
					System.out.print(" ");
				}
				for(int b=1;b<=star;b++)
				{
					while(true)
					{
						x++;
						int count=0;
						for(int j=1;j<=x;j++)
						{
							if(x%j==0)
							{
								count++;
							}
						}
						if(count==2)
						{
							System.out.print(" "+x+" ");
							break;
						}
					}
				}
			System.out.println("   ");
			space--;
			star+=2;
		}
	

	}

}
