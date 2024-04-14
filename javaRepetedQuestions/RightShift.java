//36. Do right shift by one for elements of given array?
package javaRepetedQuestions;

import java.util.Scanner;

public class RightShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements in Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int last = arr[arr.length-1];
		for(int j=arr.length-1;j>0;j--)
		{
			arr[j]=arr[j-1];
		}
		arr[0]=last;
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[j]+" ");
		}
		

	}

}
