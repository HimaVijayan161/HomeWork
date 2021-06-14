package com.Feb.revisited;

public class RemoveTags 
{

	public static void main(String args[])
	{
		 String str = "<p><b>Welcome to Tutorials Point</b></p>";
		 
		 str=str.replaceAll("\\<.*?\\>", "");
		 
		 System.out.println(str);
	}
}
