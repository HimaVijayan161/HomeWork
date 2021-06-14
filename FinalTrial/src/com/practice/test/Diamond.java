package com.practice.test;

import java.util.ArrayList;
import java.util.List;

public class Diamond {

	public static void main(String[] args) 
	{
		List l1 = new ArrayList();
		
		
		l1.add("Hima");
		
		l1.add("Hitha");
		
		String s="Hima";
		
		int i=Integer.parseUnsignedInt(s);
		
		System.out.println(i);
		
		for(Object o : l1)
		{
			System.out.println((String)o);
		}
	}

}
