package javaRepetedQuestions;

public class ReverseOfaString {

	public static void main(String[] args) {
		String name="My Name is Sohan";
		char []reverse = new char[name.length()];
		int j=0;
		for(int i =name.length()-1;i>=0;i--)
		{
			reverse[j]=name.charAt(i);
			j++;
		}
		System.out.println(reverse);
	}

}
