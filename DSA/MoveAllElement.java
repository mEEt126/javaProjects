//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

public class MoveAllElement{
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
        }
	}
}

// } Driver Code Ends


//User function Template for Java
// we can change the order to place at either end 

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        int j=0;
        int segEle[] = new int[n]; 
        
        for(int i=0; i<n; i++)         ////  negatives are right side 
        {
            if(arr[i]>=0)
            {
                segEle[j] = arr[i]; 
                j++;
            }
        }
        
        for(int i=0; i<n; i++)         // positives are left side  
        {
            if(arr[i]<0)
            {
                segEle[j] = arr[i]; 
                j++;
            }
        }
        
        for(int i=0; i<n; i++)
        {
            arr[i] = segEle[i]; 
        }
    }
}
