package home.practice.hackerrank;

public class HackerEarth {
	
	static void Java()
	{
		try
		{
			System.out.println("123");
			throw new RuntimeException("demo");
		}
		finally
		{
			System.out.println("java finally");
		}
	}

	static void Python()
	{
		
		try
		{
			System.out.println("python");
			return;
		}
		finally
		{
			System.out.println("python");
		}
	}
	
	public static void main(String args[])
	{
		try
		{
			Java();
		}
		catch(Exception e)
		{
			System.out.println("exception caught");
		}
		
		Python();
	}
}
