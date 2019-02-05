package com.hima.automation;

public class Armstrong {

	public static void main(String[] args) {
		int originalNum=121;
		int quotient=originalNum;
		int remainder=0;
		int cube=0;
		while(quotient>0)
		{
			remainder=quotient%10;
			quotient=quotient/10;
			cube=cube+(remainder*remainder*remainder);
		}
		if(cube==originalNum)
		{
			System.out.println(originalNum+" is an armstrong");
		}
		else
		{
			System.out.println(originalNum+" is not an armstrong");

		}
			
	}

}
