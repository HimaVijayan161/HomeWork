package com.Feb.revisited;

public class Fibonacci {

	public static void main(String[] args) 
	{
		
			int a=1;
			int b=1;
			int c=a+b;
			
			System.out.println(a);
			
			System.out.println(b);

			System.out.println(c);

			for(int i=1;i<10;i++)
			{
				a=b;
				b=c;
				c=a+b;
				System.out.println(c);
			}
		
	}

}
