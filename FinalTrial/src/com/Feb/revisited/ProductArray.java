package com.Feb.revisited;

public class ProductArray {

	public static void main(String[] args) 
	{
		int[] a= {10, 3, 5, 6, 2};
		
		int[] product= new int[a.length];
				
		
		int current=0;
		
		for(int i=0;i<a.length;i++)
		{
			int mult=1;

			current=a[i];
				for(int j=0;j<a.length;j++)
				{
					
					if(!(a[j]==current))
					mult=mult*a[j];
					
					//System.out.println(mult);
				}
				
				product[i]=mult;
		}	
				
		for(int k=0;k<product.length;k++)
		{
			System.out.println(product[k]);
		}

	}

}
