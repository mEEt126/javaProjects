//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class MinimumSwap
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends

class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
       int noOfSwaps = 0, min, ifSwap=0,i,j,refIndex=0;
       int copiedArr[] = nums.clone(); 
       
       Arrays.sort(copiedArr); 
       
       
       for(i=0; i<nums.length-1; i++)
       {
           if(copiedArr[i] == nums[i])
                continue; 
                
           min = nums[i]; 
           
           for(j=i+1; j<nums.length; j++)
           {
               if(min > nums[j])
               {
                   min = nums[j]; 
                   refIndex = j;     
                   ifSwap = 1; 
               }
           }
           if(ifSwap == 1)
           {
                //swap (nums[i], nums[refIndex]);
                int temp = nums[i]; 
                nums[i] = nums[refIndex];
                nums[refIndex] = temp; 
                ifSwap = 0;
                noOfSwaps++; 
           }    
       }
       return noOfSwaps; 
    }
}
