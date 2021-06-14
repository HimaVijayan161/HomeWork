package com.march.cloning;

public class CloningShallow 
{

	public static void main(String args[]) 
	{
		Address a1=new Address();
		a1.setStreet(10);
		
		Employee e1 = new Employee(10, "Hima",a1);
		
		// both point to the same memory location or you can say ..same object
	/*	Employee e2 =e1;
				
		System.out.println(e2);
		
		e1.eId=20;
		
		System.out.println(e2);
*/
		Employee e2 = null;
		try 
		{
			e2=(Employee) e1.clone();
		} 
		catch (CloneNotSupportedException e) 
		{
			e.printStackTrace();
		}
		
		e1.eId=20;
		
		e1.eName="Hitha";
		
		System.out.println(e2.eName.hashCode()+" "+e1.eName.hashCode());
		
		System.out.println(e2.getAdd().hashCode()+" "+e1.getAdd().hashCode());

		e1.add.setStreet(11);
		
		System.out.println(e2.getAdd().hashCode()+" "+e1.getAdd().hashCode());

		Address a2 = new Address();
		a2.setStreet(20);
		e1.add=a2;
		
		System.out.println(e2.getAdd().hashCode()+" "+e1.getAdd().hashCode());
		
		//System.out.println(e2);
	}
	
}


class Employee implements Cloneable
{
	int eId;
	String eName;
	Address add;
	
	Employee(int eId,String eName,Address add)
	{
		this.eId=eId;
		this.eName=eName;
		this.add=add;
	}

	public int geteId() {
		return eId;
	}

	public String geteName() {
		return eName;
	}

	public Address getAdd() {
		return add;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + "]";
	}
	
	public  Object clone() throws CloneNotSupportedException
	{
		 return super.clone();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((add == null) ? 0 : add.hashCode());
		result = prime * result + eId;
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (add == null) {
			if (other.add != null)
				return false;
		} else if (!add.equals(other.add))
			return false;
		if (eId != other.eId)
			return false;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		return true;
	}
	
	
}

class Address
{
	int street;

	public int getStreet() {
		return street;
	}

	public void setStreet(int street) {
		this.street = street;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + street;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (street != other.street)
			return false;
		return true;
	}
	
	
	
	
	
}