package com.hima.automation;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 11235813
		
		int i=1;int j=1;
		int swapFact=1;
		System.out.print(""+i+" "+j);
		for(int k=1;k<=10;k++)
		{
			swapFact=i+j;
			System.out.print(" "+swapFact);
			j=i;
			i=swapFact;
		
		}

	}

}
