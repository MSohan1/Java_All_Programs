package corejava_solving_Qspiders;

public class Increasingnumber {

	public static void main(String[] args) {
		
		int num = 12653454;
		int temp=0;
		int min=0;int max=9;
		
		temp=num;
		while(temp!=0)
		{
			min=temp%10;
			if(min<max||min==max)
			{
				max=min;
				temp=temp/10;

			}
			else {
				break;
			}
		}
		if(temp==0)
		{
			System.out.println("Increasing Number");
		}
		else {
			System.out.println("Decreasing Number");
		}
		

	}

}
