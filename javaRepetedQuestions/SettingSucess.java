package javaRepetedQuestions;
import java.util.Scanner;

public class SettingSucess {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int seatingpos[]= new int[3];
			System.out.println("Enter position of the seats");
			for(int i=0;i<3;i++)
			{
				seatingpos[i]= sc.nextInt();
			}
			
			int studentpos[]= new int[3] ;
			System.out.println("Enter position of the students");
			for(int i=0;i<3;i++)
			{
				studentpos[i]= sc.nextInt();
			}
			
			bubblesort(seatingpos);
			bubblesort(studentpos);
			int posval=0;
			int count=0;
			for(int i = 0;i<studentpos.length;i++)
			{
				posval = seatingpos[i]-studentpos[i];
				count+=Math.abs(posval);
			}
			System.out.println("Count position "+count);
	}
	public static int[] bubblesort(int[] seatingpos) {
	    int temp = 0;
	   
	    for (int i = 0; i < seatingpos.length - 1; i++) {
	        for (int j = 0; j < seatingpos.length - 1 - i; j++) {
	            if (seatingpos[j] > seatingpos[j + 1]) {
	                temp = seatingpos[j];
	                seatingpos[j] = seatingpos[j + 1];
	                seatingpos[j + 1] = temp;
	            }
	        }
	    }
	   	    return seatingpos;
	}
	


}
