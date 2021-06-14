package com.Feb.revisited;

public class MissingNumber {

	public static void main(String[] args) 
	{
			int[]a = {1, 2, 3, 4, 6};
			
			int sum=0;
			
			int actualSum=0;
			
			
			
			int total=6;
			
			for(int i=0;i<a.length;i++)
			{
				sum=sum+a[i];
			}
		
		System.out.println(sum);

			
		System.out.println(sum-total);
	}

}
