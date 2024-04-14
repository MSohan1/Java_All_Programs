package corejava_solving_Qspiders;

public class DuckNumber {

	public static void main(String[] args) {
		int num = 030045;
		int sum = 0;
		boolean count = false;
		while (num != 0) {
			sum = num % 10;
			if (sum == 0) {
				count = true;
				break;
			}
			num = num / 10;

		}
		if (count) {
			System.out.println("Duck Number");
		} else {
			System.out.println("Not a Duck Number");
		}
	}

}
