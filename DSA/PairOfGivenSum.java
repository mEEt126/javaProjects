//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class PairOfGivenSum {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) 
    {
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        int count=0; 
        
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] + arr[j] == k)
                {
                    ArrayList<Integer> a = new ArrayList<>(2); 
                    a.add(arr[i]);
                    a.add(arr[j]);
                    al.add(a); 
                    count ++ ; 
                }
            }
        }
        for (int i = 0; i < al.size(); i++) 
        {
            for (int j = 0; j < al.get(i).size(); j++) 
            {
                System.out.print(al.get(i).get(j) + " ");
            }
            System.out.println();
        }
        return count; 
    }
}

