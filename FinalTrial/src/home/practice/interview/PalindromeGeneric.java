package home.practice.interview;

public class PalindromeGeneric {

	public static void main(String[] args) 
	{
		String number="100";
		
		String reverse="";
		
		for(int i=number.length()-1;i>=0;i--)
		{
			reverse=reverse+number.charAt(i);
		}
		
		if(number.equals(reverse))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}

}
