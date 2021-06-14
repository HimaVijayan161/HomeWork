package home.practice.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class P7SortHashMapByKeys {

	public static void main(String[] args) 
	{
		Map<String,Integer> mapToTestSorting = new HashMap<String,Integer>();
		
		mapToTestSorting.put("Hima", 1);
		
		mapToTestSorting.put("Hitha", 2);
		
		mapToTestSorting.put("Ratna", 3);
		
		mapToTestSorting.put("Vijayan", 4);
		
		System.out.println(mapToTestSorting);
		
		Map<String,Integer> treeMapToTestSorting= new TreeMap<String,Integer>(mapToTestSorting);
		
		System.out.println(treeMapToTestSorting);
		
		List<Entry<String,Integer>> llOfMap= new LinkedList<>(mapToTestSorting.entrySet());
				
		Collections.sort(llOfMap, new MapByValueComparator());
		
		System.out.println(llOfMap);
		
		LinkedHashMap<String, Integer> lHMap = new LinkedHashMap<>();
		
		for(Entry<String, Integer> e1 : llOfMap)
		{
			lHMap.put(e1.getKey(), e1.getValue());
		}

	}
	
}

class MapByValueComparator implements Comparator
{
	public int compare(Object o1, Object o2) 
	{
		Entry<String,Integer> e1=(Entry<String, Integer>) o1;
		
		Entry<String,Integer> e2=(Entry<String, Integer>) o2;

		return e1.getValue().compareTo(e2.getValue());
	}

	/*@Override
	public int compare(Entry o1, Entry o2) 
	{
		Entry<String,Integer> e1=(Entry<String, Integer>) o1;
		
		Entry<String,Integer> e2=(Entry<String, Integer>) o2;

		return e1.getValue().compareTo(e2.getValue());
	}*/

}
