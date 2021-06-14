package home.practice.interview;

public class Armstrong {

	public static void main(String[] args) 
	{
		int num=153;
		
		int temp=num;
		
		int remainder=0;
		
		int sum=0;
		
		while(num>0)
		{
			remainder=num%10;
			
			num=num/10;
			
			sum=sum+(remainder*remainder*remainder);
			
		}
		System.out.println(sum);
	}

}
