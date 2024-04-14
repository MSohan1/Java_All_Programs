package javaRepetedQuestions;

public class Merging2SortedArrays {

	public static void main(String[] args) {
		int [] arr1= {1,2,3,4,5,6};
		int [] arr2 = {7,8,9,10,11,12,13,4,5};
		int arrlen = arr1.length;
		int arrlen2 = arr2.length;
		int totallen = arrlen+arrlen2;
		int []arr3 =new int[arrlen+arrlen2];
		int i=0;
		while(i<arrlen)
		{
			arr3[i] = arr1[i];
//			System.out.println(arr1[i]);
			i++;
		}
		System.out.println(totallen);
		int k=0;
		while(i<totallen)
		{
			arr3[i] = arr2[k];
//			System.out.println(arr1[i]);
			i++;
			k++;
		}
//		System.out.println(arr1[1]);
		for(int j=0;j<arr3.length;j++)
		{
			System.out.println(arr3[j]);
		}
	}

}
