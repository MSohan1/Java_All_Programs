package javaRepetedQuestions;

import java.util.Scanner;

//35. Swap odd indexed elements with its immediate next even indexed elements
public class Swappindeces {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements in Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			else {
				continue;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
