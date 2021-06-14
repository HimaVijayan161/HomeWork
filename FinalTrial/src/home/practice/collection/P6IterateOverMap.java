package home.practice.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P6IterateOverMap {

		public static void main(String[] args) 
		{
			
			Map<String,Integer> map= new HashMap<String,Integer>();
			
			map.put("Hima", 1);
			
			map.put("Hitha", 2);
			
			map.put("Ratna", 3);
			
			map.put("Vijayan", 4);
			
			//using for each on keySet to only get the keyset
				for(String str: map.keySet())
				{
					System.out.println(map.get(str));
				}
				
				//using for each on values to only get the values
				for(Integer i: map.values())
				{
					System.out.println(i);
				}
			
				//Iterate using iterator with keySet
	
				Set<String>s1 =map.keySet();
				
				Iterator iSetOfKeys= s1.iterator();
				
				while(iSetOfKeys.hasNext())
				{
					//System.out.println(iSetOfKeys.next());
					
					System.out.println(map.get(iSetOfKeys.next()));
				}
				
				//Iterate using entry set
				
				Set<Entry<String,Integer>> entrySet=map.entrySet();
				
				Iterator iEntrySet=entrySet.iterator();
				
				while(iEntrySet.hasNext())
				{
					//System.out.println(iEntrySet.next());
					Entry e1=(Entry) iEntrySet.next();
					System.out.println(e1.getKey()+" "+e1.getValue());
				}
				
				//iterate using for each with EntrySet
				
				Set<Entry<String,Integer>> entryWithForEch=map.entrySet();
				
				for(Entry<String,Integer> e:entryWithForEch)
				{
					System.out.println(e.getKey()+" value is "+e.getValue());
				}
		}
	
}	