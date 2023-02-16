//{ Driver Code Starts
import java.util.*;
import java.lang.Math;

public class BinaryInsertionSort
{
	
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			 new Solution().insertionSort(a,n);
			 printArray(a,n);
			
		t--;
		}
		
	}
}
// } Driver Code Ends


class Solution
{
  // Insertion Sort with O(N*N) TC
  /*public void insertionSort(int arr[], int n)
  {
      int count=0; 
      for(int i=1; i<arr.length; i++)
      {
          for(int j=i; j>0; j--)    // this will divide array in 2 parts ------ first sorted 0 - i && i - n will be unsorted
          {
              if(arr[j]<arr[j-1])
              {
                  int temp = arr[j];
                  arr[j] = arr[j-1]; 
                  arr[j-1] = temp;
                  count++; 
              }
          }
      }
      //System.out.println(count); 
  }*/
  
  // binary Insertion Sort O(N * logN)
  
  public void insertionSort(int arr[], int n)
  {
    for(int i=1; i<n; i++)
    {
        //find insert position  
        int target = arr[i]; 
        int position = findInsertPosition(arr, 0, i, target); 
        int j=i; 
        //System.out.println(position); 
        
        while(j>position)
        {
            arr[j] = arr[j-1];
            j--;
        }
        arr[position] = target; 
    }
  }
  
  public int findInsertPosition(int nums[], int start, int end, int target)
    {
        int mid=0;
        if(start>=end)
            return start;

        mid = start + (end-start)/2; 
        if(nums[mid] == target)
        {
            return mid; 
        }
        else if(nums[mid] < target)
        {
            return findInsertPosition(nums, mid+1, end, target); 
        }
        else
        {
            return findInsertPosition(nums, start, mid, target); 
        }
    }
  
}
