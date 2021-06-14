package com.Feb.revisited;

public class Manager {

	int id;
	
	String name;
	
	Manager(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + "]";
	}


	public static void main(String[] args) 
	{

		Manager m1 = new Manager(10,"Hima");
		
		Manager m2 = new Manager(11,"HimaHitha");
		
		System.out.println(m1+" "+m2);
		
		swap(m1,m2);
		
		System.out.println(m1+" "+m2);

	}

	public static void swap(Manager m3, Manager m4)
	{
		Manager temp;
		
		temp=m3;
		m3=m4;
		m4=temp;
	}
}
