package com.Feb.revisited;

public class SecondHighestNumber {

	public static void main(String[] args) 
	{
		int[]a  = {10,2,0,1,1002,7,100,9};

		int max=0;
		
		int second=0;
				
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				second=max;

				max=a[i];
			}
			
			else if(a[i]>second)
				second=a[i];
		}
		
		System.out.println(max);
		
		System.out.println(second);

	}

}
