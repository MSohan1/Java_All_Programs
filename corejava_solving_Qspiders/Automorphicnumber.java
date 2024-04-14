package corejava_solving_Qspiders;

public class Automorphicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15;
		int square = num*num;
		int count=0;
		int prod=1;
		int temp= num;
		int divid=1;
		while(temp!=0) {
			count++;
			temp/=10;
		}
		
		for(int i=1;i<=count;i++)
		{
			divid *=10;
		}
		prod = square-square/divid*divid;
		if(prod==num)
		{
			System.out.println("Automorphic Number");
		}
		else
		{
			System.out.println("Not an Automorphic Number");
		}

		
		// Easy Way
		boolean isautomorphic= true;
		while(num!=0)
		{
			if((num%10)!=(square%10))
			{
				isautomorphic =false;
				break;
			}
			num/=10;
			square /=10;
		}
		if(isautomorphic)
		{
			System.out.println("Automorphic Number");
		}
		else
		{
			System.out.println("Not an Automorphic Number");
		}

	}

}
