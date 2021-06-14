package home.practice.java.immutable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Immutable {

	private final Integer immutable1;
	private final String immutable2;
	private final Date mutable1;
	private final int mutable2;
	private final Address address;
	private final List<Integer> listIntegerMutable3;
	
	private Immutable(Integer immutable1, String immutable2, Date mutable1, int mutable2,Address address,List<Integer> listIntegerMutable3) 
	{
		super();
		this.immutable1 = immutable1;
		this.immutable2 = immutable2;
		//this.mutable1 = mutable1;
		this.mutable2 = mutable2;
		this.mutable1=new Date(mutable1.getDate());
		this.address=address;
		this.listIntegerMutable3=new ArrayList<Integer>(listIntegerMutable3);
	}

	public Integer getImmutable1() 
	{
		return immutable1;
	}

	public String getImmutable2() 
	{
		return immutable2;
	}

	public Date getMutable1() 
	{
		return new Date(mutable1.getDate());
	}

	public int getMutable2() 
	{
		return mutable2;
	}
	
	public Address getAddress() 
	{
		return address;
	}

	public List<Integer> getlistIntegerMutable3() 
	{
		return new ArrayList<Integer>(listIntegerMutable3);
	}

	@Override
/*	If we want to represent an object of a class as a String,
	then we can use the toString() method which returns a textual
	representation of the object.*/
	public String toString() {
		return "Immutable [immutable1=" + immutable1 + ", immutable2=" + immutable2 + ", mutable1=" + mutable1
				+ ", mutable2=" + mutable2 + ", address=" + address + ", listIntegerMutable3=" + listIntegerMutable3
				+ "]";
	}

	public static void main(String[] args) throws ParseException 
	{
		Date d1 = new Date();
		List<Integer> listIntegerMutable3 =new ArrayList<Integer>();
		listIntegerMutable3.add(10);
		listIntegerMutable3.add(20);
		Address a1 = new Address(10,"131-A");
		Immutable test1 = new Immutable(120,"Hima",d1,7,a1,listIntegerMutable3);

		System.out.println(test1+ " before changes in date");
		
		
		 //a1 = new Address(11,"132");
		 
		//	System.out.println(test1+ " before changes in date");


		/**
		 * There are 2 ways by which we can modify the internal state of our immutable obiect,
		 * 1. using ref variable we used while passing in constructor
		 * 2. using getter method and then calling setter methods on that object
		 * 
		 * this is done using 
		 * 1)the setDate  method of Date which modifies the value of the date object directly
		 * because both ref variables refer to the same object, so we need to create new object
		 * before setting the value (in constructor) 
		 * 2) while returning  as well (getter) 
		 * 
		 * d1 -> |current date| <- mutable1
		 */
		d1.setDate(10);
	    test1.getMutable1().setDate(20);
	    
	    
	    listIntegerMutable3.add(30);
	    test1.getlistIntegerMutable3().add(40);
	    
		System.out.println(test1+ " after changes in date for testing immutability");
		/*test immutability
		 * 
		 * test1.immutable1=20;
		 * We get an error saying, The final field Immutable.immutable1 cannot be assigned
		 * if it was not final & only private- we could have easily changed this value within the class atleast
		 */
	}
}
