//1.    Find the sum of all given elements from an int array?
//2.    Find the min element from the given int array?
//3.    Find the max element from the given int array?
//4.    Find the 2nd min element from the given int array?
//5.    Find the 2nd max element from the given int array?
//6.    Find the average value of an int array?
//7.    Find out the sum of all even indexed elements from a given int array?
//8.    Find out the sum of all odd indexed elements from a given int array?
//9.  Find out the min value from all even indexed elements from a given  int array?
//10. Find out the max value from all odd indexed elements from a given int  array?
//11. Find out the avg value from all even indexed elements from a given int
//array?
//12. Find out the avg value from all odd indexed elements from a given int
//array?
//13. Find out the sum of all elements from a first half of given int array?
//14. Find out the sum of all elements from a second half of given int array?
//15. Find out the min value from a first half of given int array?
//16. Find out the min value from a second half of given int array?
//17. Find out the max value from a first half of given int array?
//18. Find out the max value from a second half of given int array?
//19. Find out the avg value from a first half of given int array?
//20. Find out the avg value from a second half of given int array?
//21. Read all elements from an array in the reverse order?
//22. Read first half of the elements in the reverse direction from an array?
//23. Read second half of the elements in the reverse direction from an array?
//24. Read only even indexed elements from an array?
//25. Read only even indexed elements from an array in the reverse order?
//26. Read only odd indexed elements from an array?
//27. Read only odd indexed elements from an array in the reverse order?
//28. Find out an index of a specified element from a given array?
//29. Swap two given indexed elements from the array?
//30. Reverse the elements of given array?
//31. Reverse only first half of the elements of given array?
//32. Reverse only last half of the elements of given array?
//33. Reverse only even indexed of the elements of given array?
//34. Reverse only odd indexed of the elements of given array?
//35. Swap odd indexed elements with its immediate next even indexed elements
//of given array?
//36. Do right shift by one for elements of given array?

package javaRepetedQuestions;

import java.util.Scanner;

public class SumOfAllNumbersInAnArray {

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
		System.out.println("The sum of array is "+sum);
		
	}

}
