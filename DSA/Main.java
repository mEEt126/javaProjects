//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> subArr = new ArrayList<Integer>(); 
        int sum = 0, j = 0, res = -1;
        int target = -s;
        for (int i=0; i<n; i++) 
        {
            target += arr[i];
        }
        //System.out.println(target); 
        if (target < 0) 
        {
            subArr.add(-1); 
            return subArr;
        }    
    
        for (int i = 0; i<n; i++) 
        {
            sum += arr[i];
    
            while (sum > s) 
            {
                //System.out.println(sum); 
                sum -= arr[j++];
            }
            if (sum == s) 
            {
                subArr.add(j+1);
                subArr.add(i+1); 
                res = 1; 
                break; 
            }
        }
        if(res == -1)
            subArr.add(-1); 
        return subArr; 
    }
}
