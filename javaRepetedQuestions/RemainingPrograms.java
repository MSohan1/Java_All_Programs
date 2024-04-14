//Reverse only odd indexed of the elements of given array?
//35. Swap odd indexed elements with its immediate next even indexed elements
//of given array?
//36. Do right shift by one for elements of given array?
package javaRepetedQuestions;

import java.util.Scanner;

public class RemainingPrograms {

	public static void main(String[] args) {
//		Reverse only odd indexed of the elements of given array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements in Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int rev[];
		int len = arr.length/2;
		if(len%2==0)
		{
			 rev = new int[(arr.length/2)+1];
		}
		else {
			rev = new int[arr.length/2];
		}
		
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			else
			{
				rev[j]=arr[i];
				j++;
			}
		}
		
		System.out.println(rev[2]);
		for(int i=0;i<rev.length;i++)
		{
			System.out.println(rev[i]);
		}
		
	}

}
