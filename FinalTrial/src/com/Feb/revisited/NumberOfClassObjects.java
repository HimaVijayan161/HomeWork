package com.Feb.revisited;

public class NumberOfClassObjects {

	static int objects;
	{
		objects=objects+1;
	}
	
	public NumberOfClassObjects() 
	{
		
	}
	public NumberOfClassObjects(int num) 
	{
		
	}
	public static void main(String[] args) 
	{
		NumberOfClassObjects n1 = new NumberOfClassObjects();
		
		NumberOfClassObjects n2 = new NumberOfClassObjects();

		NumberOfClassObjects n3 = new NumberOfClassObjects();

		NumberOfClassObjects n4 = new NumberOfClassObjects();
		
		NumberOfClassObjects n5 = new NumberOfClassObjects(10);
		
		System.out.println(objects);
	}

}
