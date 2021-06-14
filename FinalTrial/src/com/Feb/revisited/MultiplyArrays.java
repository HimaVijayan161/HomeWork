package com.Feb.revisited;

public class MultiplyArrays {

	public static void main(String[] args) 
	{

		int[] left_array = {1, 3, -5, 4};
		   
		int[] right_array = {1, 4, -5, -2};
		
		int[] result= new int[right_array.length];
		
		for(int i=0;i<left_array.length;i++)
		{
			for(int j=i;j<=i;j++)
			{
				result[i]=left_array[i]+right_array[j];
				
				//System.out.println(result[i]);

			}
		}
		
		for(int k=0;k<result.length;k++)
			System.out.println(result[k]);
	}

}
