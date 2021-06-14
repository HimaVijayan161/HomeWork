
public class NumericEnding {

	public static void main(String[] args) 
	{

		String str1="000002";
		String str2="999999";
		String str3="GL-321";
		String str4="GL-999";
		String str5="DRI000EDERS0RE";
		String str6="DRI000EDERS0RE99999";
		String str7="DRI0009EDERS0RE99999";

		
		//System.out.println(str1.charAt(str1.length()-1));
		
		Increment(str1);
		Increment(str2);
		Increment(str3);
		Increment(str4);
		Increment(str5);
		Increment(str6);
		Increment(str7);

	}

	static void Increment(String referenceNumber)
	{
		if(Character.isDigit(referenceNumber.charAt(referenceNumber.length()-1)) && referenceNumber.charAt(referenceNumber.length()-1)!='9')
		{
			int sum=Integer.parseInt(String.valueOf(referenceNumber.charAt(referenceNumber.length()-1)))+1;
			System.out.println(referenceNumber.substring(0, referenceNumber.length()-1)+sum);
		}
		
		
		else if(Character.isDigit(referenceNumber.charAt(referenceNumber.length()-1)) && referenceNumber.charAt(referenceNumber.length()-1)=='9')
		{
		 
			int countOfNine=0;
			for(int i=referenceNumber.length()-1;i>=0;i--)
			{
				if(referenceNumber.charAt(i)=='9')
					countOfNine++;
				else
					break;
			}
			
			String strWithNine=referenceNumber.substring(0, referenceNumber.length()-countOfNine);
			
			for(int i=0;i<countOfNine;i++)
			{
				strWithNine=strWithNine+'0';
			}
			System.out.println(strWithNine);
		}
		
		else
		{
			System.out.println(referenceNumber);
		}
	}
}

