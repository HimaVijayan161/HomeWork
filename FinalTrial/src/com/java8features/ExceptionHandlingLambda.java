package com.java8features;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambda 
{
		
	public static void main(String[] args) 
	{
		int[] n= {10,20,30,40};
		
		process(n, 10, wrapperToHandleException(n,k)->);
		/*process(n,0,(i,k)->
		{
			try 
			{			
				System.out.println(i/k);
			}
			
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
					
		});*/
	}
	
/*	private static void process(int[] numbers,int key)
	{
		for(int i:numbers)
				System.out.println(i+key);
	}*/
	
	
	
	private static void process(int[] numbers,int key,BiConsumer<Integer, Integer> consumer)
	{
		for(int i:numbers)
				consumer.accept(i,key);
	}
	
	private static BiConsumer<Integer, Integer> wrapperToHandleException(BiConsumer<Integer, Integer> consumer)
	{
		return consumer;
	}
}
