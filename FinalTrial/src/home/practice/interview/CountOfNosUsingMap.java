package home.practice.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfNosUsingMap 
{
	public static void main(String[] args) 
	{
		String str= "This this is is done by Saket Saket";
		
		int count=0;
		
		Map<String,Integer> wordCount= new HashMap<>();
		
		String[] strArray=str.split(" ");
		
		for(String s:strArray)
		{
			if(wordCount.get(s)==null)
			{
				wordCount.put(s, 1);
			}
			else
			{
				count=wordCount.get(s);
				wordCount.put(s, ++count);
			}
		}
		
		Set<Entry<String,Integer>> setOfEntries=wordCount.entrySet();
				
		for(Entry e1:setOfEntries)
		{
			System.out.println("Count of "+e1.getKey() +" is "+e1.getValue());
		}
		
	}
}
