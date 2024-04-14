package javaRepetedQuestions;

import java.util.Scanner;
public class RemovingDublicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] permenentArrey = {1,2,3,4,5,6,7,8,9};
		System.out.println("Enter How many values");
		int num = sc.nextInt();
		int[] Dublicatearrey = new int[num];
		for(int i=0;i<num;i++)
		{
			Dublicatearrey[i] = sc.nextInt();
		}
		missing(Dublicatearrey,permenentArrey);
		
	}
	public static void missing(int[] Dublicatearrey,int[] permenentArrey) {
		int pos = 0;
		int repeatednum=0;
		for(int i=0;i<Dublicatearrey.length-1;i++)
		{
			if(Dublicatearrey[i]==Dublicatearrey[i+1])
			{
				pos = i+1;
				repeatednum = Dublicatearrey[i];
			}
		}
		int [] finalarr = {pos,permenentArrey[repeatednum]};
		System.out.println(finalarr[0]+" "+finalarr[1]);
	}
}
