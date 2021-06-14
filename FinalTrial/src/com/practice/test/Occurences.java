package com.practice.test;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Occurences {

	public static void main(String[] args) 
	{
		
		String s ="Selenium is an automation tool";

		/*Integer i =10;
		
		System.out.println(i.toString());
		
	//	String.valueOf(i)
		
		String s = "Hima";
		
		s.
		*/
		
		Map<Character,Integer> mapOccurences = new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			if(mapOccurences.get(s.charAt(i))==null)
			{
				mapOccurences.put(s.charAt(i), 1);
			}
			
			else
			{
				count=mapOccurences.get(s.charAt(i));
				mapOccurences.put(s.charAt(i), ++count);
			}
			
		}
		/*Map<Character,Integer> mapOccurences = new HashMap<>();
		
		String[]sArray= s.split(" ");
		
		for(String s1 :sArray)
		{
			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				//System.out.println(s1.charAt(i));
				if(mapOccurences.get(s1.charAt(i))==null)
				{
					mapOccurences.put(s1.charAt(i), 1);
				}
				
				else
				{
					count=mapOccurences.get(s1.charAt(i));
					mapOccurences.put(s1.charAt(i), count);
				}
				
			}
		}
		*/
		System.out.println(mapOccurences);
		
		//Set<Entry<Character,Integer>>entryV=mapOccurences.entrySet();
		
		List<Entry<Character,Integer>> lhm= new LinkedList<>(mapOccurences.entrySet());
		
		int highest=lhm.get(0).getValue();
		
		char cChar=0;
		
		System.out.println(lhm.get(0).getKey());
		
		for(Entry<Character,Integer> e1:lhm)
		{
			if(e1.getValue()>=highest)
			{
				max
			}
		}
		/*
		Collections.sort(lhm, new EntryComparison());
		
		System.out.println(lhm);
		
		int max=0;
		
		Integer highest=lhm.get(0).getValue();
		
		

		System.out.println(" highest"+lhm.get(0).getKey());
		
	    List<Entry<Character,Integer>> lo= new LinkedList<>(lhm.subList(1, lhm.size()));
		for(Entry<Character,Integer> l:lo)
		{
			//highest=l.getKey();
			if(l.getValue()>=highest)
			{
				max=l.getValue();
				System.out.println("2nd highest "+l.getKey());
				//System.out.println(highest);

			}
			
		}
		*/
	}

	
}

class EntryComparison implements Comparator<Entry<Character,Integer>>
{
	public int compare(Entry o1,Entry o2)
	{
		return (int) o2.getValue() - (int)o1.getValue();
	}
}
