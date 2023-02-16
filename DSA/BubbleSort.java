//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        boolean ifSwap = false;
        int noSwap=0;
        
       for(int i=0; i<arr.length-1; i++)
       {
           ifSwap = false;      /// if array is sorted then it will break the execution  
           for(int j=0; j<arr.length-i-1; j++)
           {
               if(arr[j] > arr[j+1])
               {
                   int temp = arr[j]; 
                   arr[j] = arr[j+1]; 
                   arr[j+1] = temp;
                   noSwap++; 
                   ifSwap = true; 
               }
           }
           if(ifSwap == false)
            break; 
       }
       //System.out.println(noSwap); 
    }
}

//{ Driver Code Starts.

class BubbleSort
{
    //method to print the Elements of the array
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		while(t>0)
		{
		    //taking total elements
			int n = sc.nextInt();
			
			//creating a new array of length n
			int arr[] = new int[n];
			
			//inserting elements to the array
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt(); 
			}
			
			//calling bubbleSort() method
			new Solution().bubbleSort(arr,n);
			
			//calling printArray() method
			printArray(arr);
			
		t--;	
		}
	}

}
// } Driver Code Ends
