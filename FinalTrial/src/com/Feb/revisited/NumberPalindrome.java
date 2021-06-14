package com.Feb.revisited;

public class NumberPalindrome 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int number=1001;
		
		int reverse=0;
		
		int remainder = 0;
		
		while(number>0)
		{
			remainder=number%10;
			
			reverse=reverse*10+remainder;
			
			number=number/10;
			
		}

		System.out.println(reverse);
	}

}
