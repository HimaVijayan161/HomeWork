package home.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P8CArrayListComparableComparator 
{
	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();
		
		list.add("Hima");
	
		list.add("Tejas");
		
		list.add("Hima");
		
		list.add("Hitha");
		
		System.out.println(list);
		
		//Collections.sort(list,Collections.reverseOrder());
		
		Collections.reverse(list);

		
		//Collections.sort(list);
		
		System.out.println(list);
		
		List<Employee> listEmployee = new ArrayList<Employee>();
		
		Employee e1 = new Employee(12, "Hima");
		
		Employee e2 = new Employee(10, "Hitha");
		
		Employee e3 = new Employee(11, "Ratna");

		listEmployee.add(e1);
		
		listEmployee.add(e2);
		
		listEmployee.add(e3);
		
		System.out.println(listEmployee);
		
		//Collections.sort(listEmployee);
		
		System.out.println(listEmployee);
		
		//Collections.sort(listEmployee, new CompareEmployeeByName());
		
		Collections.sort(listEmployee,Collections.reverseOrder());
		
		System.out.println(listEmployee);
		

	}

}

class Employee implements Comparable<Employee>
{
	int eId;
	String ename;
	
	Employee(int eId,String ename)
	{
		this.eId= eId;
		this.ename=ename;
	}

	public int geteId() {
		return eId;
	}

	public String getEname() {
		return ename;
	}

	@Override
	public int compareTo(Employee o) 
	{
		return this.eId-o.geteId();
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", ename=" + ename + "]";
	}
	
}

class CompareEmployeeByName implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEname().compareTo(o2.getEname());
	}
	
}

class CompareEmployeeByNameAndId implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		if(e1.getEname().equals(e2.getEname()))
		{
			return e1.geteId()-e2.geteId();
		}
		
		return e1.getEname().compareTo(e2.getEname());
		
	}
}