//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

public class ReverseArray{
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
		a = obj.largest(a, n); 
           for (int i = 0; i < n; i++) {
                System.out.println(a[i]); 
            }
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Compute {
    
    public int[] largest(int arr[], int n)
    {
        int i=0, j=arr.length-1;
        
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j]; 
            arr[j] = temp; 
            i++;
            j--; 
        }
        
        return arr; 
    }
}
