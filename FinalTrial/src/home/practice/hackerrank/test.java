package home.practice.hackerrank;

import java.util.Arrays;

public class test {

	
	static
	{
		code(3);
	}
	static void code(int x)
	{
		System.out.println(x);
	}
	int a=10;
	test(int x)
	{
		this.x=x;
		code(3);
	}
	int x=10; 		
	public static void main(String args[])
	{
		test t = new test(10);
		
		t1 r = new t1(2);
		
		r=t;
		
		t=r;
		
		System.out.println(t.x);
		
		//Arrays.sort(a, fromIndex, toIndex);
	}
}

 class t1 extends test
{

	t1(int x) {
		super(x);
		a=30;
		// TODO Auto-generated constructor stub
	}
	 
	}
