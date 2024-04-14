//Find the min element from the given int array?
//3.    Find the max element from the given int array?
//4.    Find the 2nd min element from the given int array?
//5.    Find the 2nd max element from the given int array?
package javaRepetedQuestions;


import java.util.Arrays;
import java.util.Scanner;

public class MinimumElemntInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements in Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Minimum Element is "+arr[0]);
		System.out.println("Maximum Element is "+arr[arr.length-1]);
		System.out.println("Second Minimum Element is "+arr[1]);
		System.out.println("Second Maximum Element is "+arr[arr.length-2]);
	}

}
