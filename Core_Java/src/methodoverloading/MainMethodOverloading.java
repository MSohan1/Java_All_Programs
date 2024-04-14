package methodoverloading;

public class MainMethodOverloading {
//OverLoading int array Argumrnts for main method 
	public static void main(String[] args) {
		System.out.println("Main method String");
		int [] name = {1,2,3,4};
		main(name);
		main(true);
		main(4);
	}
	public static void main(int[] args) {
		System.out.println("int Method");
	}
	public static void main(boolean flag) {
		System.out.println("Boolean Method : "+flag);
	}
	public static void main(int num) {
		System.out.println("Int Method : "+num);
	}


	//OverLoading Boolean Argumrnt for main method
/*
	public static void main(String[] args) {
		System.out.println("Main method String");
		main(true);
	}
	public static void main(boolean flag) {
		System.out.println("Boolean Method : "+flag);
	}
*/

/*
	public static void main(String[] args) {
		System.out.println("Main method String");
		main(5);
	}
	public static void main(int num) {
		System.out.println("Int Method : "+num);
	}
	*/

}
