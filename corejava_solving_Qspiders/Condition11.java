package corejava_solving_Qspiders;

public class Condition11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =128 ;
		boolean res = ((num>=60&& num<=130) && (num%3==0 && num%4==0) && ((num%10)>6));
		System.out.println(res);

	}

}
