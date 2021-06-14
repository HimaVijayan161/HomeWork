package com.Feb.revisited;

public class OddEven {

	public static void main(String[] args) 
	{
		int[] a = {1,4,2,5,9,3,10,6};
		
		int[] evenOdd= new int[a.length];
		
		int count=0;
		
		int end=a.length-1;
		
		for(int i=0;i<a.length;i++)
		{
			
			 if(a[i]%2!=0)
					{
					  evenOdd[count]=a[i];
					  count++;	
					}
			 else
			 {
				 evenOdd[end]=a[i];
				 end--;
			 }
			 
			 
		}
		for(int j=0;j<a.length;j++)
		System.out.println(evenOdd[j]);
	}

}
