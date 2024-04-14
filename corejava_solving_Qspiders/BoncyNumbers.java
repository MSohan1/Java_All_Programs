package corejava_solving_Qspiders;

public class BoncyNumbers {

	public static void main(String[] args) {

//		int num = 12653454;
//		int temp = 0;
//		int min = 0;
//		int max = 9;
//
//		temp = num;
//		while (temp != 0) {
//			min = temp % 10;
//			if (min < max || min == max) {
//				max = min;
//				temp = temp / 10;
//
//			} else {
//				break;
//			}
//		}
//		if (temp == 0) {
//			System.out.println("Increasing Number");
//		} else {
//			while (temp != 0) {
//				min = temp % 10;
//				if (min > max || min == max) {
//					max = min;
//					temp = temp / 10;
//
//				} else {
//					break;
//				}
//			}
//			if (temp == 0) {
//				System.out.println("Decreasing Number");
//			} else {
//				System.out.println("Bouncy Number");
//			}
//		}

//Second--Way

		int num = 12653454;
		int temp = 0;
		int min = 0;
		int max = 9;
		int totalCount = 0, increasingCount = 0;
		temp = num;
		while (temp != 0) {
			totalCount++;
			min = temp % 10;
			if (min < max || min == max) {
				max = min;
				temp = temp / 10;

			} else {
				break;
			}
		}

		if (increasingCount == totalCount)//if increasing number == Total Count then the number is in increasing order
		{
			System.out.println("Increasing Number");//if increasing number-1==0 then the number is not  increasing order atlest once
		}
		else if ((increasingCount - 1) == 0) 
		{
			System.out.println("Decreasing Number");
		}
		else
		{
			System.out.println("Bouncy Number");
		}

	}

}
