package temp;

import java.util.HashMap;
import java.util.Map;

public class StringReverse {

	public static void main(String[] args) {

		String str="I write code in Java";
		
		String rev = "";
		
		char[]strRev=str.toCharArray();
		
		for(int i=strRev.length-1;i>=0;i--)
		{
			rev=rev+strRev[i];
		
		}
			
		//System.out.println(rev);
		
		
		String[] arr=str.split(" ");
		
		String revv="";
		
		for(int i=arr.length-1;i>=0;i--)
		{
			revv=revv+arr[i]+" ";
		}	
		
		System.out.println(revv);

	
	
	String vow1="AnuradhaHimaReetaU";
	
	String vow=vow1.toLowerCase();
	
	String voo="aeiou";
	
	Map<Character,Integer> mapCounts= new HashMap<Character,Integer>();

	int count=1;
	for(char c:vow.toCharArray())
	{

		int index = 0;
		while(index<voo.length())
		{
			if(c==voo.charAt(index))
			{
					if((mapCounts.containsKey(c)))
					{
						mapCounts.put(c, count++);
					}
					else
					{
						mapCounts.put(c, count);
					}
			}
		index++;
		}	
	}
	System.out.println(mapCounts);
	
	/*int l=1;
	
	char[] vowelsToChar=vow.toLowerCase().toCharArray();
	
	char[] vowels= {'a','e','i','o','u'};
	
		for(int j=0;j<vowelsToChar.length;j++)
		{
			for(int k=0;k<vowels.length;k++)
			
			if(vowelsToChar[j]==vowels[k])
			{
				if(mapCounts.get(vowelsToChar[j])==null)	
				{
						mapCounts.put(vowelsToChar[j], l);
				}		
				System.out.println(mapCounts);

			}
				else
				{
					l++;
					mapCounts.put(vowelsToChar[j], l);

				}
			System.out.println(mapCounts);

		}
		System.out.println(mapCounts);*/
	}}


