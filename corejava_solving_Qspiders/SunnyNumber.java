package corejava_solving_Qspiders;

public class SunnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15;
		boolean isSunny=false;
		for(int i=1;i*i<=num+1;i++)
		{
			if(i*i==(num+1))
			{
				isSunny=true;
				break;
			}
		}
		if(isSunny)
		{
			System.out.println(num+" is a Sunny Number ");
		}
		else
		{
			System.out.println(num+" is not a Sunny Number ");
		}

	}

}
