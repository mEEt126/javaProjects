import java.util.Scanner;

public class MultipleCatchBlock{
        
    public static void main(String args[]){

        int n, divisor;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Aim is to try and test Multiple Catch block in Java");
        System.out.println("Enter Size of array"); 
        n = sc.nextInt(); 

        int ArrayElements[] = new int[n]; 
        int DummyArray[] = null;  

        System.out.println("Enter Elements of array");
        for(int i=0; i<n; i++)
        {
            ArrayElements[i] = sc.nextInt(); 
        }

        System.out.println("Enter Divisor for Array Elements");
        divisor = sc.nextInt(); 

        try{
            for(int i=0; i<n; i++)
            {
                ArrayElements[i] = ArrayElements[i]/divisor; 
            }
            DummyArray[0] = 10; // just assiging value at 
            System.out.println(ArrayElements[0]);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Please Enter valid Divisor");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
            System.out.println("Please Enter valid Index");
        }    
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("General Exception");
        }
        finally{
            sc.close();
            System.out.println("In the finally block");
        }
    }
}
