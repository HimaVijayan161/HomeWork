package com.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLambdaJava7 {

	public static void main(String[] args) 
	{

		List<Person> persons = Arrays.asList
				(
				new Person("Hima","Vijayan"),
				new Person("Tejas","Jethva"),
				new Person("Vijayan","Krishnan"),
				new Person("Charles","Dickens")
				);
		
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) 
			{
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
			
		});	
		
		System.out.println("Print all persons");
		printAll(persons);
		
		
		System.out.println("Print based on conditions");

		printBasedOnCondition(persons, new Condition() {

			@Override
			public boolean test(Person person) 
			{
				return (person.getFirstName().startsWith("C"));
					
			}

		});
		
		
/*		
		System.out.println("Print based on last name");
		printBasedOnLastName(persons);*/
	}
	
	public static void printAll(List<Person> persons)
	{
		for(Person person:persons)
			
			System.out.println(person);
	}

	public static void printBasedOnCondition(List<Person> persons, Condition condition)
	{
		for(Person person:persons)
		{
			if(condition.test(person))
				System.out.println(person);
		}
	}
	
/*	public static void printBasedOnLastName(List<Person> persons)
	{
		
		for(Person person : persons)
		{
			if(person.getLastName().startsWith("D"))
				System.out.println(person);
		}
	}*/
}

interface Condition
{
	boolean test(Person person);
}

