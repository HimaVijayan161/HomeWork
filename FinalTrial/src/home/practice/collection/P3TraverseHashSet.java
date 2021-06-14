package home.practice.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P3TraverseHashSet {

	public static void main(String[] args) 
	{
		//iterate & see that it removes off duplicates
		
		Set<String> setString = new HashSet<String>();
		
		setString.add("Hima");
		
		setString.add("Tejas");
		
		setString.add("Hima");
		
		setString.add("Hitha");
		
		for(String str:setString)
		{
			System.out.println(str);
		}
		
		Iterator setIterator = setString.iterator();
		
		while(setIterator.hasNext())
		{
			System.out.println(setIterator.next());
		}
		
	}

}
