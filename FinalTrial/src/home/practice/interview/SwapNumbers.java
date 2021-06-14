package home.practice.interview;

public class SwapNumbers {

	public static void main(String[] args) 
	{
		int a=0;
		int b=10;
		System.out.println(a +" "+b);
		
		//with 3rd variable
		
/*		int temp=a;
		a=b;
		b=temp;
		System.out.println(a +" "+b);*/
		
		//without 3rd variable
		
		a =a+b;
		b =a-b;
		a= a-b;
		System.out.println(a +" "+b);

		
		
	}

}
