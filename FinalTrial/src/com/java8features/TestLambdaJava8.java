package com.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class TestLambdaJava8 {

	public static void main(String[] args) 
	{
		List<Person> persons = Arrays.asList(
				new Person("Hima","Vijayan"),
				new Person("Tejas","Jethva"),
				new Person("Vijayan","Krishnan"),
				new Person("Charles","Dickens")				
				);
		
		ListIterator<Person> iPerson=persons.listIterator();
		
		while(iPerson.hasNext())
		
		//persons.forEach(person->System.out.println(person));
		
		//persons.stream().filter(p->p.getFirstName().startsWith("V")).forEach(p->System.out.println(p));
		
		
		System.out.println(persons.stream().filter(p->p.getFirstName().startsWith("V")).count());

		
		Collections.sort(persons,(Person p1,Person p2)-> p1.getFirstName().compareTo(p2.getFirstName()));
		
		//printBasedOnConditions(persons, p->  p.getFirstName().startsWith("V") );
		
		//printBasedOnConditions(persons, p->  true );

	}
	
	
	

/*	public static void printBasedOnConditions(List<Person> persons,Condition condition)
	{
		for(Person person:persons)
		{
			if(condition.test(person))
				System.out.println(person);
		}
	}*/
	
	
	public static void printBasedOnConditions(List<Person> persons,Predicate<Person> predicate)
	{
		for(Person person:persons)
		{
			if(predicate.test(person))
				System.out.println(person);
		}
	}
}
