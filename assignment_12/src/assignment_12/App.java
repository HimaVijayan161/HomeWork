package assignment_12;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Return a version of the given string, where for every star (*) 
	in the string the star and the chars immediately to its left and right are gone. 
	So "ab*cd" yields "ad" and "ab**cd" also yields "ad". 	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		starKill("cd*zq")  <b>---></b>"cq"<br>
		starKill("ab**cd")    <b>---></b> "ad" <br>
		starKill("wacy*xko") <b>---></b> "wacko" <br>
	 */
	
	public static String starKill(String str) {
		
	String s1="";
	String right="";
	String left="";


	int count=0;

	System.out.println(str);
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='*')
		{
			int index=str.indexOf(str.charAt(i))+1;
			//System.out.println(index);
			left=left+str.substring(0, index-2);
			
			if(!str.substring(index+1,str.length()).contains("*"))
			{
			right=right+str.substring(index+1,str.length());
			}
			
			//System.out.println(s3+s2);
			str=left+right;
			System.out.println(str);
		}
	}
	
	return str;
/*	
	System.out.println(count);
	if(str.contains("*"))
			{
				int indexOfStar=str.indexOf("*");
	
				System.out.println(indexOfStar);
				if(indexOfStar==0)
					s1=str.substring(indexOfStar+1, str.length());

				else
				{
					System.out.println(str.substring(0,indexOfStar-1));
					System.out.println(str.substring(indexOfStar+2,str.length()));

					s1=str.substring(0,indexOfStar-1)+str.substring(indexOfStar+2,str.length());
				}
				//System.out.println(s1);

				System.out.println(s2);
			}
			return s1+s2;*/
	}


	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		//starKill("sm*eil*ly");
	}
}
