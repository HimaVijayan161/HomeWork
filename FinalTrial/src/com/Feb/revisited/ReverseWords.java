package com.Feb.revisited;

public class ReverseWords {

	public static void main(String[] args) 
	{
		String s="Hi this is Hima";
		
		String reverse = "";
		
		String[] a= s.split(" ");
		
		for(int i=a.length-1;i>=0;i--)
		{
			reverse=reverse+a[i]+" ";
		}
		System.out.println(reverse);
	}

}
