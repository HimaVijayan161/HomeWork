package com.march.exception;

public class ExceptionExample1 {
	public static void main(String[] args) {
		test();
	}
	private static void test(){
		try
		{
			System.out.println("In try");
			throw new ArithmeticException();
		} 
		catch(Exception e)
		{
			System.out.println("In catch");
			throw new ArrayIndexOutOfBoundsException();
		}
		finally
		{
			System.out.println("In finally");
			throw new NullPointerException();
		}
	}
}