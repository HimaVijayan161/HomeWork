package com.java8features;

public class LambdaSample 
{

	public static void main(String[] args) 
	{
		ILambda lambda1 =value->	{System.out.println(value);};
		
		
		ILambda lambda2 =(value)->
		{
			System.out.println(value);
		};
		
		
		lambda1.printString("Hima");
		
	}
	
}
