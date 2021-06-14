package home.practice.interview;

import java.util.HashMap;
import java.util.Map;

public class LargestSequence {

	public static void main(String[] args) 
	{
           String str= "acdsaaares123aa";
           
           Map<Character,Integer> mapChars = new HashMap<Character,Integer>();
           
           for(int i=0;i<str.length();i++)
           {
        	   if(str.charAt(i)==str.charAt(i+1))
        	   {
        		   if(mapChars.containsKey(str.charAt(i)))
        		   {
        			   
        		   }
        	   }
           }
	}

}
