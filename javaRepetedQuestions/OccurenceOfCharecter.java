package javaRepetedQuestions;

public class OccurenceOfCharecter {

	public static void main(String[] args) {
		
		
		String sentence = "Hello I am Sohan";
		int len = sentence.length();
		int counter[] = new int[256];
		for(int i=0;i<len;i++)
		{
			counter[(int)sentence.charAt(i)]++;
		}
//		for(int i=0;i<counter.length;i++)
//		{
//			System.out.println(counter[i]);
//		}
		for(int i=0;i<256;i++)
		{
			if(counter[i]!=0)
			{
				System.out.println((char) i + " --> " + counter[i]);  
			}
		}
	}

}
