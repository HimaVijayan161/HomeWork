package home.practice.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIteration 
{
	public static void main(String[] args) 
	{
		Map<String,String> map= new HashMap<>();
		map.put("hima", "1");
		map.put("htiha", "2");
		map.put("ratna", "3");
		
		System.out.println("using keySet");

		for(String s:map.keySet())
		{
			System.out.println("key is "+s+" "+map.get(s)+" value");
		}
		
		Set<String> set= map.keySet();
		
		Iterator<String> s1=set.iterator();
		
		System.out.println("using iterator & keySet");
		
		while(s1.hasNext())
		{
			String str=s1.next();
			System.out.println("key is " +str+" value is "+map.get(str));
		}
		
		Iterator<Entry<String,String>>iEntry=map.entrySet().iterator();
		
		while(iEntry.hasNext())
		{
			
		}
	}	
	
}
