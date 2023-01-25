//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class FirstRepeatingElement{
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking total count of elements
            int n = sc.nextInt();

            // creating a new array of size n
            int arr[] = new int[n];

            // inserting elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            // calling firstRepeated method
            // and printing the result
            System.out.println(ob.firstRepeated(arr, n));
        }
    }
}
// } Driver Code Ends

// User function Template for Java

// By using hashing 
// TC : O(n) + O(n) = O(n)
// SC : O(n*2)  

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) 
    {
        HashMap<Integer, Integer> record = new HashMap<>(); 
        
        for(int i=0; i<n; i++)
        {
            if(record.get(arr[i]) == null)
            {
                record.put(arr[i], 1);                   // add new reocrd
            }
            else
            { 
                Integer count = record.get(arr[i]);
                record.put(arr[i], count=count+1);             // increment by 1 
            }
        }
        
        for(int i=0; i<n; i++)
        {
            if(record.get(arr[i]) > 1)
                return i+1; 
        }
        //System.out.println(record);
        return -1; 
    }
    
}

//  BY Brute Force solution 
// TC : O(N^2)
// SC : O(1) 

/*class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) 
    {
        int firstRepeatedIndex = 1; 
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i] == arr[j])
                    return i+1; 
            }
        }
        return -1; 
    }
}*/
