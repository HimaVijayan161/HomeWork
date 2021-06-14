package home.practice.interview;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {

	public static void main(String[] args) 
	{

		String s="Saakeatttt";
		
		int count=0;
		
		Map<Character,Integer> mapCounts= new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
						if(mapCounts.get(s.charAt(i))==null)
						{
							mapCounts.put(s.charAt(i), 1);
						}
						
						else
						{
							count=mapCounts.get(s.charAt(i));
							mapCounts.put(s.charAt(i), ++count);
						}
		}
		
		System.out.println(mapCounts);
		
		// another approach without maps
		
		 char[] chars = s.toCharArray();
		 
		   for (int i=0; i<s.length();i++) {
               for(int j=i+1; j<s.length();j++) {
                          if (chars[i] == chars[j]) {
                                     System.out.println(chars[j]);
                                     count++;
                                     break;
                           }
                }
    }
	}

}
