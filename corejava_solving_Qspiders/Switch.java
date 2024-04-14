package corejava_solving_Qspiders;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Month Number");
		int a = scanner.nextInt();
		switch(a){
		case 3 :case 4:case 5 : System.out.println("Summer Season");
			break;
		case 6 :case 7:case 8 : System.out.println("Rainy Season");
			break;
		case 9 :case 10:case 11 : System.out.println("Spring Season");
			break;
		case 12 :case 1:case 2 : System.out.println("Winter Season"); 
			break;
		default: System.out.println("Enter Valid Month number");
		}
	
	}

}
