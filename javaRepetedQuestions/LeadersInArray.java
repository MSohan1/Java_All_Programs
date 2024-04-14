package javaRepetedQuestions;

public class LeadersInArray {

	public static void main(String[] args) {

		int arr[] = {16, 17, 4, 3, 5, 2};
		int elements[] =new int[arr.length]; 
		int max_element =0;
		for(int i = arr.length-1;i >=0 ; i--)
		{
			if(arr[i]>max_element)
			{
				max_element = arr[i];
				elements[i]=max_element;
				System.out.println(max_element);
			}
		}
	}

}
