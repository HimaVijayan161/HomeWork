package temp;

public class UnSortedMinimumDiff {

	public static void main(String[] args) 
	{

	int[] a = {3, 1, 9, 16, 26, 9};

	int temp;
	
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=i;j<a.length-1;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
			
			System.out.println(a[i]);

		}
	}
		
		
	}

}
