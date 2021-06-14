package home.practice.java.immutable;

public class Address 
{
	 private int streetNo;
	 private String streetName;
	 
	Address(int streetNo, String streetName) 
	{
		super();
		this.streetNo = streetNo;
		this.streetName = streetName;
	}

	public int getStreetNo() 
	{
		return streetNo;
	}

	public String getStreetName() 
	{
		return streetName;
	}

	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", streetName=" + streetName + "]";
	}

}
