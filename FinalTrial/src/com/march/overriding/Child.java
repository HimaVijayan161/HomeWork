package com.march.overriding;
class Parent{ 
	 public int var = 10;
	  
	 public void print(){ 
	  int var = 20;
	    
	  System.out.println("I am Parent 1:"+var);
	  System.out.println("I am Parent 2:"+this.var);
	 }
	 
	 int x = 10;
	 
	 public Parent getObject() {
	  return new Parent();
	 }
	 
	 public static void printA() {
	        System.out.println("I am Parent");
	    }
	}
	 
	class Child extends Parent{ 
	 public int var = 30;
	  
	 public void print(){ 
	  int var = 40;
	    
	  System.out.println("I am Child 1:"+var);
	  System.out.println("I am Child 2:"+this.var);
	  System.out.println("I am Child 3:"+super.var);
	 } 
	 
	 int x = 20;
	 
	 public Child getObject() {
	  return new Child();
	 }
	 
	 public static void printA() {
	        System.out.println("I am Child");
	    }
	}
	 