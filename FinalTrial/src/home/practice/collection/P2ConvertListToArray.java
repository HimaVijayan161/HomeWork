package home.practice.collection;

import java.util.ArrayList;
import java.util.List;

public class P2ConvertListToArray {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		
		list.add("Hima");
		
		list.add("Tejas");
		
		list.add("Hima");
		
		list.add("Hitha");
		


		//converted using toArray() method
		
		String[]stringList=list.toArray(new String[list.size()]);
		
		for(String s:stringList)
		{
			System.out.println(s);
		}
		
		//converted using get method of list using traditional for loop

		String convertedToArray[]= new String[list.size()];
		
			for(int i=0;i<list.size();i++)
			{
				convertedToArray[i]=list.get(i);
				System.out.println(convertedToArray[i]);
			}
	}

}
