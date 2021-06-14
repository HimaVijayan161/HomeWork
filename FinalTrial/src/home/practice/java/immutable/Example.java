package home.practice.java.immutable;

import java.util.ArrayList;
import java.util.List;

public class Example { 
      
	public static void main(String[] args) {

		if(false&&(false||true))
			System.out.println("hima");
		List<Employee> list = new ArrayList<Employee>();
		
	
		
		list.add(new Manager());
		
		System.out.println(""+list);
		
	}
     
	
    } 

class Employee{}
class Manager extends Employee{}
