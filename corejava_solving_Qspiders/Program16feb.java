package corejava_solving_Qspiders;


// Tech Number Program
public class Program16feb {

	public static void main(String[] args) {

		int num=2250;
//	Split number into two halves
//	find divisor to split the number
//	for that first count digits in the number by using temp
		
		int temp=num;
		int count=0;
		while(temp!=0) {
			count++;
			temp/=10;
		}
		System.out.println("Count of Digits: "+count);
//		find the divisor my multiplying it by 10 for count/2 times
		int divisor=1;
		for(int i=0;i<count/2;i++)
		{
			divisor=divisor*10;
		}
		System.out.println("Divisor of Digits: "+divisor);
		int fh = num/divisor;
		int lh = num%divisor;
		System.out.println("First of Digits: "+fh+"\nLast half of Digits: "+lh);
		int sum = fh+lh;
		//check square of sum is equal to number or not
		if(sum*sum==num) {
			System.out.println("Tech Number");
		}
		else
		{
			System.out.println("Not a tech Number");
		}
	}

}
