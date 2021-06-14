package com.Feb.revisited;

public class SampleSingletonMain {

	public static void main(String[] args) 
	{
		System.out.println(Singleton.getInstanceOfSingleton());
		
		System.out.println(Singleton.getInstanceOfSingleton());

		System.out.println(Singleton.getInstanceOfSingleton());
		
		
		System.out.println(EagerSingleton.getEagerSingleton());
		
		System.out.println(EagerSingleton.getEagerSingleton());

		System.out.println(EagerSingleton.getEagerSingleton());

		String s2 ="hello";
		
		String s3 ="hello"; 
		
		String s4 = new String("hello");
		
		s2 = s2.concat("world");
		
		s4=s4.intern();
		
		System.out.println(s3==s4);
		
		System.out.println(s3);


	}

}
