package home.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P10SynchronizedCollection {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();

		Set<Integer> set= new HashSet<Integer>();
		
		List listSync= Collections.synchronizedList(list);
		
		Set setSync= Collections.synchronizedSet(set);
	}

}
