package home.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class P1TraverseArrayList {

	public static void main(String[] args) 
	{

		List<String> list = new ArrayList<String>();
		
		list.add("Hima");
		
		list.add("Tejas");
		
		list.add("Hima");
		
		list.add("Hitha");
		
		for(String s:list)
		{
			//System.out.println(s);
			s+="50";
		}
		System.out.println("-------------------");
		Iterator iList= list.iterator();
		
		while(iList.hasNext())
		{
			System.out.println(iList.next());
		}
		
		ListIterator lIlist= list.listIterator();
		
		while(lIlist.hasNext())
		{
			System.out.println(lIlist.next());
		}

	}

}
