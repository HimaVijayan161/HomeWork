package home.practice.interview;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean isPrime=true;
		int num=sc.nextInt();
		
		for(int i=2;i<num;i++)
		{
			if(num==2)
			{
				break;
			}	
			else if(num%i==0)
			{
				isPrime=false;
				break;
			}	

		}
		System.out.println(isPrime);
	}

}
