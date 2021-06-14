package com.Feb.revisited;

public class KComplimentary {

	public static void main(String[] args) 
	{
		int arr[]= {7, 1, 5, 6, 9, 3, 11, -1};
		
		int k=10;
		
		int pair[]= new int[2];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]+arr[j])==k)
				{
					pair[0]=arr[i];
					
					pair[1]=arr[j];
					
					System.out.println(pair[0]);
					
					System.out.println(pair[1]);
					
					break;

				}
			}
		}
	}

}
