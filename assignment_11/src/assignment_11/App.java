package assignment_11;

import ignore.TestingUtils;

public class App {


	/**

	Given a string, return a string where for every char in the original, append another. 
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		repeatChar("The")  <b>---></b>"TThhee"<br>
		repeatChar("AAbb")    <b>---></b> "AAAAbbbb" <br>
		repeatChar("Hi-There") <b>---></b> "HHii--TThheerree" <br>
	 */
	
	public static void repeatChar(String str) {

		char c;
		String s="";
		//String s=""+str.charAt(0);
		for(int i=0;i<str.length();i++)
		{
			//System.out.println(c=str.charAt(i));
			s=s+str.charAt(i)+str.charAt(i);
			System.out.println(s);
		}
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		//TestingUtils.runTests();
		repeatChar("Hima");
	}
}
