//6.    Find the average value of an int array?
//7.    Find out the sum of all even indexed elements from a given int array?
//8.    Find out the sum of all odd indexed elements from a given int array?

package javaRepetedQuestions;

import java.util.Scanner;

public class NumaricalsinArray {

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
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		System.out.println("The average of array is "+(sum/arr.length));
	
		sum=0;
		for(int i=0;i<n;i=i+2)
		{
			sum+=arr[i];
		}
		System.out.println("The sum of all even indexed elements from a given int array "+sum);
		sum=0;
		for(int i=1;i<n;i=i+2)
		{
			sum+=arr[i];
		}
		System.out.println("The sum of all odd indexed elements from a given int array "+sum);
	}

}
