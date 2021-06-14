package home.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class P9AddElementAtIndexList {

	public static void main(String[] args) 
	{
		List<String> list = new LinkedList<String>();
		
		list.add("Hima");
	
		list.add("Tejas");
		
		list.add("Hima");
		
		list.add("Hitha");
		
		System.out.println(list);
		
		list.add(2, "Vijayan");
		
		System.out.println(list);
		
		list.remove(2);
		
		System.out.println(list);
		
		List<String> aList = new ArrayList<String>(list);
		
		Collections.sort(aList, Collections.reverseOrder());
		
		System.out.println(aList);
		
		Set<Integer> set= new HashSet<Integer>();
		
		set.add(1);
		
		set.add(2);
		
		set.add(3);

		//Integer stringArrayFromHashSet[]=set.toArray(new Integer[set.size()]);
		
		Integer[]stringList=list.toArray(new Integer[list.size()]);

		
		//set.toArray(stringArrayFromHashSet);
		
}

}
