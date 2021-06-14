package home.practice.collection;

import java.util.ArrayList;
import java.util.List;

public class P4ArrayListContainsElement {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		
		list.add("Hima");
		
		list.add("Tejas");
		
		list.add("Hima");
		
		list.add("Hitha");
		
		System.out.println(list.contains("aeeR"));
	}

}
