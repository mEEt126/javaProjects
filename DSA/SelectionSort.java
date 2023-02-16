//{ Driver Code Starts
import java.util.*;

class SelectionSort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int min = arr[i], minLocation=i; 
        while(i<arr.length)
        {
            if(arr[i]<min)
            {
                min = arr[i]; 
                minLocation = i; 
            }
            i++; 
        }
        return minLocation; 
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    int noOfSwaps = 0; 
	    for(int i=0; i<n; i++)
	    {
	       // find min element from rest of the arr
	       int location = select(arr, i); 
	       if(location != i)
	       {
	           int temp = arr[location]; 
	           arr[location] = arr[i]; 
	           arr[i] = temp;
	           noOfSwaps++; 
	       }
	    }
	    System.out.println(noOfSwaps); 
	}
}
