package com.Feb.revisited;

public class Anagram {

	public static void main(String[] args)
	{
		String str1="hima";
		
		String str2="mahi";
		
		int count=0;
		
		for(int i=0;i<str1.length();i++)
		{
			for(int j=0;j<str2.length();j++)
			{	
				if(str1.charAt(i)==str2.charAt(j))
				{
					count++;
				}
			}	
		}
		System.out.println(count);
		if(count==str1.length())
		{
			System.out.println("anagram");
		}

	}

}
