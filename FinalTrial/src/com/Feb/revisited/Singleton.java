package com.Feb.revisited;

public class Singleton 
{
	private static Singleton singleton;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstanceOfSingleton()
	{
		if(singleton==null)
			singleton=new Singleton();
		return singleton;
	}
	
}
