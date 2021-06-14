package com.march.overriding;

public class MainClass {
	 
	 public static void main(String[] args) {
		 
		/* Parent p = new Child();
		  System.out.println(p.getObject().x);*/
		  
		 
		 Parent parent = new Child();
		  parent.printA();
		   
		  Child child = new Child();
		  child.printA();
		  
		  Parent p = new Child();
		  p.printA();
		  
	 /* Parent p = new Parent();
	  System.out.println(p.var);
	  p.print();
	  System.out.println("---------------");
	   
	  Child c = new Child();
	  System.out.println(c.var);
	  c.print();
	  System.out.println("---------------");
	   
	  Parent pc = new Child(); //(OR p = c)
	  System.out.println(pc.var);
	  pc.print();
	  System.out.println("---------------");*/
		 
		 
	 }
	}