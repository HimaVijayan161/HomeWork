package com.java8features.others;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java8features.Person;

public class TestLambdaJava8 {

	public static void main(String[] args) 
	{
		List<Person> persons = Arrays.asList(
				new Person("Hima","Vijayan"),
				new Person("Tejas","Jethva"),
				new Person("Vijayan","Krishnan"),
				new Person("Charles","Dickens")				
				);
		
		Collections.sort(persons,(Person p1,Person p2)-> p1.getFirstName().compareTo(p2.getFirstName()));
		
		printBasedOnConditions(persons, p->  p.getFirstName().startsWith("V"),p-> System.out.println(p));
		
		printBasedOnConditions(persons, p->  true,p->System.out.println(p) );

	}
	
	

/*	public static void printBasedOnConditions(List<Person> persons,Condition condition)
	{
		for(Person person:persons)
		{
			if(condition.test(person))
				System.out.println(person);
		}
	}*/
	
	
	public static void printBasedOnConditions(List<Person> persons,Predicate<Person> predicate,Consumer<Person> consumer)
	{
		for(Person person:persons)
		{
			if(predicate.test(person))
				consumer.accept(person);
		}
	}
}
