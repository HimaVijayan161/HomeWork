package com.practice.test;
public class Casting { 
	  
    // Driver code 
    public static void main(String[] args) 
    { 
        // Upcasting 
        Parent p = new Child(); 
        p.name = "GeeksforGeeks"; 
       
        Parent p2 = new Parent();
  
        // This parameter is not accessible 
        //p.id = 1; 
        System.out.println(p.name); 
        p.method(); 
  
        // Trying to Downcasting Implicitly 
        // Child c = new Parent(); - > compile time error 
  
        // Downcasting Explicitly 
        
        Child c2 = new Child();
        c2.sleep();
        
        Parent p1 = new Parent();
        Child c = (Child) p1; 
  
        c.id = 1; 
        System.out.println(c.name); 
        System.out.println(c.id); 
        c.method(); 
        
        run((Child) p2);
    } 
    
    public static void run(Child c)
    {
    	System.out.println(c);
    }
} 