//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.io.*;

public class MergeWOExtraSpace
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    long arr1[] = new long[n];
		    long arr2[] = new long[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Long.parseLong(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Long.parseLong(inputLine[i]);
		    }
		    Solution ob = new Solution();
		    ob.merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int p1=0, p2=0;  
        while(p1 != n && p2 != m)
        {
            if(arr1[p1] > arr2[p2])
            {
                //System.out.println(arr1[p1] +" "+ arr2[p2]);
                // swap between arrays
                long temp = arr1[p1]; 
                arr1[p1] = arr2[p2]; 
                arr2[p2] = temp; 
                // bubble sort/Insertion sort arr2 as it is nearly sorted
                bubbleSort(arr2,m);
            }
            //System.out.println(arr1[p1] +" "+ arr2[p2]);
             p1++; 
        }
    }
    
    
    public static void bubbleSort(long arr[], int n)
    {
        boolean ifSwap = false;
        int noSwap=0;
        
       for(int i=0; i<arr.length-1; i++)
       {
           ifSwap = false; 
           for(int j=0; j<arr.length-i-1; j++)
           {
               if(arr[j] > arr[j+1])
               {
                   long temp = arr[j]; 
                   arr[j] = arr[j+1]; 
                   arr[j+1] = temp;
                   noSwap++; 
                   ifSwap = true; 
               }
           }
           if(ifSwap == false)
            break; 
       }
       System.out.println(noSwap); 
    }
}

