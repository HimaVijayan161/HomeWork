package home.practice.techbeamers;

public class Trouble {

	/*void rightHere() {
	      throw new Exception();
	   }*/
	
	static void compute (int a) throws Object {
		throw new Object(a);	 
		
		StringBuffer s;
    }
	

		
		

       public static void main(String args[]) throws Myexception {
           try {
                compute(3);
            }

            catch(ArithmeticException e) {
              System.out.print("Exception");
            }
       
		
		/*try {
            int i, sum;
            sum = 10;
            for (i = -1; i < 3 ;++i) {
                sum = (sum / i);
            System.out.print(i);
            }
        }
        catch(ArithmeticException e) {     	
            System.out.print("0");
        }*/
		 
             /*int a = args.length;
             int b = 10 / a;
             System.out.print(a);
             try {
                  if (a == 1)
                      a = a / a - a;

                   if (a == 2) {
                       int arr[] = new int[8];
                       arr[8] = 9;
                  }
				}
				catch (ArrayIndexOutOfBoundsException| ArithmeticException e) {
                  System.out.println("TypeA");
				}
				catch (ArithmeticException e) {
                 System.out.println("TypeB");
				}
			*/
	}
}
