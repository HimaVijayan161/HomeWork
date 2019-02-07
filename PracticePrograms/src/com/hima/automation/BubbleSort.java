package com.hima.automation;

public class BubbleSort {

	public static void main(String[] args) {
		/*The algorithm works by comparing each item in the list with the item next to it,
		and swapping them if required. In other words, the largest element has bubbled to
		the top of the array. The algorithm repeats this process until it makes a pass all
		the way through the list without swapping any items.*/

		
		int a[]={2,5,3,4,1};
		int temp=0;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;		

				}
			}
			System.out.println(a[i]);
		}
		
	}

}
