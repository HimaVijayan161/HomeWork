package home.practice.interview;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		int number=1001;
		
		int expectedNumber=number;
		
		int reverse=0;
		
		int remainder=0;
				
		int reverseNumber=0;
		
		while(number >0)
		{
			remainder=number%10;
			reverseNumber=reverseNumber*10+remainder;
			System.out.println(reverseNumber);
			number=number/10;
		}
		
		if(expectedNumber==reverseNumber)
		{
			System.out.println("palindrome");
		}
	}

}
