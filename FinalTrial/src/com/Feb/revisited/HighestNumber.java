package com.Feb.revisited;

public class HighestNumber {

	public static void main(String[] args) 
	{
		int[]a  = {10,2,0,1,1002,7,100,9,0};
		
		int max=0;
		
		int temp;
		for(int i=0;i<a.length;i++)
		{
			
			 if(max<a[i])
			{
				/*temp=max;
				max=a[i];
				a[i]=temp;*/
				
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
