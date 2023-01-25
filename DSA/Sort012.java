//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

/*class Solution
{
    public static void sort012(int a[], int n)
    {
        Arrays.sort(a);  
    }
}*/


class Solution
{
    public static void sort012(int a[], int n)
    {
        int record[] = new int[3]; 
        for(int i=0; i<n; i++)
        {
            if(a[i] == 0)
                record[0]++;
            else if(a[i] == 1)
                record[1]++; 
            else
                record[2]++; 
        }
        //System.out.println(record[0] + " " + record[1] + " " + record[2]); 
        
        for(int i=0; i<n; i++)
        {
            if(record[0]>0)
            {
                a[i] = 0; 
                record[0]--; 
            }
            else if(record[1]>0)
            {
                a[i] = 1;
                record[1]--;
            }
            else
            {
                a[i] = 2;
                record[2]--; 
            }
        }
    }
}

//{ Driver Code Starts.

public class Sort123{
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends
