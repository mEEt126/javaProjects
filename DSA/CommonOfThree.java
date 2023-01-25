//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class CommonOfThree
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> arrList = new ArrayList<>();  
        int index=0; 
        
        if(n1 < n2 && n1 < n3)
        {
            for(int i=0; i<n1; i++)
            {
                if(Arrays.binarySearch(B, A[i]) >=0 && Arrays.binarySearch(C, A[i]) >= 0)
                {
                    arrList.add(A[i]); 
                    B[Arrays.binarySearch(B, A[i])] = -1;
                    C[Arrays.binarySearch(C, A[i])] = -1;
                    Arrays.sort(B);
                    Arrays.sort(C);
                }
            }
        }
        else if(n2 < n1 && n2 < n3)
        {
            for(int i=0; i<n2; i++)
            {
                if(Arrays.binarySearch(A, B[i]) >=0 && Arrays.binarySearch(C, B[i]) >= 0)
                {
                    arrList.add(B[i]); 
                    A[Arrays.binarySearch(A, B[i])] = -1;
                    C[Arrays.binarySearch(C, B[i])] = -1;
                    Arrays.sort(A);
                    Arrays.sort(C);
                }
            }
        }
        else
        {
            for(int i=0; i<n3; i++)
            {
                if(Arrays.binarySearch(B, C[i]) >=0 && Arrays.binarySearch(A, C[i]) >= 0)
                {
                    arrList.add(C[i]); 
                    B[Arrays.binarySearch(B, C[i])] = -1;
                    A[Arrays.binarySearch(A, C[i])] = -1;
                    Arrays.sort(B);
                    Arrays.sort(A);
                }
            }
        }
        /*for(int a=0; a<n1; a++)
        {
            System.out.print(A[a] + " "); 
        }
        System.out.println();
        for(int a=0; a<n2; a++)
        {
            System.out.print(B[a] + " "); 
        }
        System.out.println();
        for(int a=0; a<n3; a++)
        {
            System.out.print(C[a] + " "); 
        }
        System.out.println();*/
        return arrList; 
    }
}
