package com.Feb.revisited;

public class AverageHighestTenNos {

	public static void main(String[] args) 
	{
			int[]a = new int[100];
			
			for(int i=0;i<100;i++)
			{
				a[i]=i;
				//System.out.println(a[i]);
			}
			
			int temp;
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length-1;j++)
				{
					if(a[j]<a[j+1])
					{
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
						
						//System.out.println(a[i]+" a[j] "+a[j]+" a[j]");

					}
				}
				
			}
			//
			
			int sum=0;
			System.out.println("After sorting");
			for(int i=0;i<10;i++)
			{
				sum=sum+a[i];
			}
			System.out.println(sum/10);

	}

}
