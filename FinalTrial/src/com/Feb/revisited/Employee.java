package com.Feb.revisited;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Employee implements Comparable<Employee>

//public class Employee 

{
	int id;
	String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
	
	@Override
	public int compareTo(Employee o) {
		
		return this.name.compareTo(o.name);
	}
	
	public static void main(String args[])
	{
		Map<Employee,Integer> mapEmployees = new TreeMap<Employee,Integer>();
		
/*		Employee e1 = new Employee(10,"Hima");
		
		Employee e2 = new Employee(10,"Hima");

		mapEmployees.put(e1, 1);
		
		mapEmployees.put(e2, 2);

		System.out.println(mapEmployees);*/
		
		
		Employee e1 = new Employee(11,"hima");
		
		Employee e2 = new Employee(1,"tha");
		
		Employee e3 = new Employee(10, "ejas");
		
		mapEmployees.put(e1, 1);
		
		mapEmployees.put(e2, 2);
		
		mapEmployees.put(e3, 3);

		System.out.println(mapEmployees);

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}

class EmployeeIdComparison implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) 
	{
		return o1.getId()-o2.getId();
	}
	
}

class EmployeeNameIdComparison implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) 
	{
		if(o1.getName().compareTo(o2.getName())==0)
		
			return o1.getId()-o2.getId();
		
		else
			
			return o1.getName().compareTo(o2.getName());
		
	}
	
}

