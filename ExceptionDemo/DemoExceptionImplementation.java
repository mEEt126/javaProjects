import java.util.Scanner;

public class DemoExceptionImplementation {
        
    public static void main(String args[]){

        int n, divisor, indexToBeChecked;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Aim is to try and test Nested Try & Catch block in Java");
            System.out.println("Enter Size of array"); 
            n = sc.nextInt(); 

            int ArrayElements[] = new int[n]; 

            System.out.println("Enter Elements of array");
            for(int i=0; i<n; i++)
            {
                ArrayElements[i] = sc.nextInt(); 
            }

            // To check ArithmeticException
            try{
                System.out.println("Enter divisor which will divide all element of Array");
                divisor = sc.nextInt();
                if(divisor == 0)
                    throw new ArithmeticException(); 
            }
            catch(ArithmeticException e)
            {
                System.err.println(e);
                System.out.println("Divisor can not be Zero");
                System.out.println("Please enter valid divisor"); 
                    divisor = sc.nextInt();
            } 

            // Nested Try catch implementation
            try{
                    //for(int i=0; i<n+1; i++)  // possibility of AIOBE 
                    for(int i=0; i<n; i++)
                    {
                        try{
                            //ArrayElements[i] = ArrayElements[i]/divisor;   //  // possibility of AE
                            ArrayElements[i] = ArrayElements[i]/0;
                        }
                        catch(ArithmeticException ae)
                        {
                            System.out.println(ae);
                            System.out.println("Please enter valid divisor");
                        }
                    }
            }
            catch(ArrayIndexOutOfBoundsException ae)
            {
                System.out.println(ae);
                System.out.println("Please Enter Valid index");
            }


            // To check ArrayOutOfBoundException    
            try{    
                System.out.println("Enter index number to check answer of elements");
                indexToBeChecked = sc.nextInt(); 
                System.out.println("Element at Index " + indexToBeChecked + " is " + ArrayElements[indexToBeChecked]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
                System.out.println("Enter valid index in the range of 0 to " + n);
                    indexToBeChecked = sc.nextInt(); 
                System.out.println("Element at Index " + indexToBeChecked + " is" + ArrayElements[indexToBeChecked]);
            }
        }
    }
}
