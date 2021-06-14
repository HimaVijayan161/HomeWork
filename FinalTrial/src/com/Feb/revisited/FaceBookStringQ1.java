package com.Feb.revisited;

import java.util.HashMap;
import java.util.Map;

public class FaceBookStringQ1 {

	public static void main(String[] args) 
	{
		//A4B2C3D4E3G1
		String givenString="AAAABBCCCDDDDEEEG";
		
		String newString="";
		
		int count=0;
		
		Map<Character,Integer> stringCount = new HashMap<Character,Integer>();
		
			for(int i=0;i<givenString.length();i++)
			{
				if(stringCount.containsKey(givenString.charAt(i)))
				{
					count=stringCount.get(givenString.charAt(i));
					
					stringCount.put(givenString.charAt(i),++count);
				
				}
				
				else
				{
					stringCount.put(givenString.charAt(i), 1);
				}
				
				//newString = newString+givenString.charAt(i)+stringCount.get(givenString.charAt(i));

			}
			System.out.println(newString);
			System.out.println(stringCount);
	}

}
