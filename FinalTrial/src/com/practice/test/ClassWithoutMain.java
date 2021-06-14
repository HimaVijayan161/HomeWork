package com.practice.test;

import java.util.ArrayList;
import java.util.List;

public class ClassWithoutMain {

	  public static void main(String args[]) {
		
		 /* String str1 = "beginnersbook";    
			
			 The Java String intern() method searches the string "beginnersbook"  
			 * in the memory pool and returns the reference of it.
			 
			String str2 = new String("beginnersbook").intern(); 
			//prints true 
			System.out.println("str1==str2: "+(str1==str2));
			
			try {}
			catch(ClassNotFoundException c)
			{}
			*/
		  
		
	            try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	  }
}
