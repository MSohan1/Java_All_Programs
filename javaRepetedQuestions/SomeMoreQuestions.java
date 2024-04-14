//38.Print only those numbers from array whose sum is greater than 15
//    ip:{12,34,87,150,21,78}
//    op:{87,150,78}
//
//39.Print prime numbers from an array
//    ip:{12,3,13,150,23,78}
//    op:{3,13,23}
//
//40.Print reverse of each number from an array
//     ip:{12,34,87,152,21,78}
//     op:{21,43,78,215,12,87}
//
//41.Print numbers whose second digit is 2
//    ip:{12,34,827,150,21,7289}
//    op:{12,827,7289}
//
//42.Print missing number upto 100 from given array
//    ip:{12,34,87,15,21,78}
//       
//43.Sort an array with 3 different sorting technique
//   for an instance define each technique in single sentence.
//
//44.Arrange first half of an array in reverse direction
//   i.e (reverse firsthalf of array)
//
//45.Find secondmin from an unsorted array 
//    make sure to have less no of iterations.
//
//46.Arrange an array by Moving all 0's at last in an array
//
//47.Swap odd index element with an immediate even index element
//
//48.Delete duplicate number from an array
//    a.with sorting
//    b.without sorting
package javaRepetedQuestions;

import java.util.Scanner;

public class SomeMoreQuestions {

	public static void main(String[] args) {
//		38.Print only those numbers from array whose sum is greater than 15
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements in Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The numbers from array whose number is greater than 15");
		for(int i=0;i<n;i++)
		{
			if(arr[i]>15)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		//39.Print prime numbers from an array
		//	    ip:{12,3,13,150,23,78}
		//	    op:{3,13,23}
		
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i];
			int count=0;
			for(int j=1;j<=temp;j++)
			{
				if(temp%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(temp+" ");
			}
		}
		
		
		System.out.println("Arrange of zeros");
		//46.Arrange an array by Moving all 0's at last in an array
		int i=0;
		for(int j=0;j<=n-1;j++)
		{
			if(arr[j]!=0)
			{
				int dub = arr[j];
					arr[j]=arr[i];
					arr[i]=dub;
					i++;
			}
		}
		
		for(int j=0;j<=n-1;j++)
		{
			System.out.println(arr[j]+" ");
		}
		
		
		

	}

}
