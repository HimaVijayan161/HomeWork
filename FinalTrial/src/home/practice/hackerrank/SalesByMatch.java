package home.practice.hackerrank;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class SalesByMatch {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int count=1;
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        
        Map<Integer,Integer> mapPairs= new HashMap<Integer,Integer>();

        count=1;
        for(int i:ar)
        {
        	//System.out.println(mapPairs.get(map.get(i)));
            if(map.get(i)==null)
            {
                map.put(i,1);
            }
           else 
                {  	
                   count=map.get(i);
                   map.put(i, ++count);
                }
        }
        System.out.println(map);
        Set<Entry<Integer, Integer>> e = map.entrySet();
        
        int countOfPairs=0;
        for(Entry<Integer,Integer> eq:e)
        {
        	countOfPairs=countOfPairs+eq.getValue()/2;
        }
        return countOfPairs;
    }

    private static final Scanner	 scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      /*  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
*/
    	int n=9;
        int[] ar = {10,20,20,10,10,30,50,10,20};

        int result = sockMerchant(n, ar);

        System.out.println(result);
/*        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    }
}