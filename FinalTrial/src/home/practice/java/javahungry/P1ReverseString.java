package home.practice.java.javahungry;

public class P1ReverseString {

	public static void main(String[] args) 
	{

		String toBeReversed= "Hima is a funny girl";
		
		System.out.println(toBeReversed);
		
		String reversedString="";
		
		
		for(int i=toBeReversed.length()-1;i>=0;i--)
		{
			reversedString=reversedString+toBeReversed.charAt(i);
		}
		
		System.out.println(reversedString);
		
		//
		String stringInProperFormat=""; 
		
		String[] splitToBeReversed=toBeReversed.split(" ");
		
				for(String s:splitToBeReversed)
				{
					for(int i=s.length()-1;i>=0;i--)
					{
						stringInProperFormat=stringInProperFormat+s.charAt(i);
					}
					stringInProperFormat=stringInProperFormat+" ";
				}
				
				System.out.println(stringInProperFormat);
	}

}
