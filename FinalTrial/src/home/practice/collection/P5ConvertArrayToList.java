package home.practice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P5ConvertArrayToList {

	public static void main(String[] args)
	{
		
		Integer arrayToList[]= new Integer[] {1,2,3,4,6,4};
		
		List<Integer> listFromArray= new ArrayList<Integer>(Arrays.asList(arrayToList));
		
		Set<Integer> setFromArray= new HashSet<Integer>(Arrays.asList(arrayToList));

		System.out.println(setFromArray.isEmpty());
		
			for(Integer i:listFromArray)
			{
				System.out.println(i);
			}
			
			for(Integer i:setFromArray)
			{
				System.out.println(i);
			}
	}

}
