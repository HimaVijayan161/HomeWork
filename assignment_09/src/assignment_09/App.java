package assignment_09;

import ignore.TestingUtils;

public class App {


	/**

	Given 2 positive int arguments (a, b), return whichever argument is 
	nearest to the number 21 without going over.
	Return 0 if they both go over 21. 
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		nearestTwentyOne(19, 21)   <b>---></b> 21 <br>
		nearestTwentyOne(21, 19)    <b>---></b> 21 <br>
		nearestTwentyOne(19, 22) <b>---></b> 19 <br>
		nearestTwentyOne(32, 22) <b>---></b> 0 <br>
	 */
	
	public static int nearestTwentyOne(int a, int b) {
		
		int number=21;
		
		int n=0;
		
		int diffA=Math.abs(a-number);
		int diffB=Math.abs(b-number);

		System.out.println("diffA : "+diffA+" diffA: "+diffB);

		if(a==number)
			n=a;
		
		if(b==number)
			n=b;
		
		if(b>number && a >number)
		{
			n=0;
		} 
		 
		if(b>number && a <number)
		n=a;
		else if(a>number && b < number)
		n=b;
		
			
		else if(a<number && b <number)
		{
			if(diffA<diffB)
				n=a;
			else
				n=b;
		}
		
		return n;
	}
	

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
