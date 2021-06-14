package home.practice.interview;

public class SecondHighestNumber {

	public static void main(String[] args) 
	{
			int arr[] = new int [] {10,1,5};
			
			
			//find highest number
			
/*		int max=0;
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>max)
				{
					max=arr[i];
				}
			}
			
			System.out.println(max);*/
			
			//find 2nd highest
			
			int max =0;
			int secondLargest=0;
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>max)
				{
					secondLargest=max;
					max=arr[i];
				}
				
				else if(arr[i]>secondLargest)
				{
					secondLargest=arr[i];
				}
			}
			System.out.println("max is "+max);
			
			System.out.println("2ndLargest is "+secondLargest);
	}

}
