package javaRepetedQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestElementInArrey {

	public static void main(String[] args) {
		int[] arr = {1,5,7,8,9,4,6};
		Arrays.sort(arr);
		int Second = arr[(arr.length-2)];
		System.out.println(Second);
	}

}
