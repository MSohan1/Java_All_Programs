package javaRepetedQuestions;

import java.util.Scanner;

public class CommenCharacterbtwn2Strings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String1");
		String str1 = sc.nextLine();
		System.out.println("Enter a String2");
		String str2 = sc.nextLine();
		int []counter = new int[256];
		
		for(int i=0;i<str1.length();i++)
		{
			for(int j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					System.out.println(str1.charAt(i));
				}
			}
		}
	}

}
