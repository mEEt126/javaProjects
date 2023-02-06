import java.util.List;
import java.util.Scanner;
import java.util.*; 
import java.lang.*;

public class Fibonacci 
{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> li = new ArrayList<>(); 
        
        int n = sc.nextInt();
        li = fibonacci(n); 

        for(int i=0; i<li.size(); i++)
        {
            System.out.println(li.get(i));
        }
    } 
    
    public static ArrayList<Integer> fibonacci(int n)
        {
            ArrayList<Integer> fibArr = new ArrayList<>();
         
            if(n == 0 || n == 1)
            {
                fibArr.add(0);
                fibArr.add(1); 
            }
            else
            {
                //fibArr[n-1] = list.toArray(fibonacci(n-1)).get(n-1) + list.toArray(fibonacci(n-2).get(n-2));  
                fibArr.add(fibArr.get(fibonacci(n-1))+fibArr.get(fibonacci(n-2))); 
            }
            return fibArr;
        }    

}
