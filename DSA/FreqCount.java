// Java program to count frequencies of array items
import java.util.Arrays;

public class FreqCount
{
	public static void countFreq(int arr[], int n)
	{
      		int ifChange = 0,count=1; 
      		Arrays.sort(arr);
	      for(int i=1; i<arr.length; i++)
	      {
		if(arr[i] != arr[i-1])
		{
		  System.out.println(arr[i-1] + " " + count);
		  count=1; 
		}
		else
		{  
			count++; 
		}  
	      }
	      System.out.println(arr[n-1] + " " + count); 
    	}


// Driver code
	public static void main(String []args)
	{
		int arr[] = new int[]{ 10,20,20};
		int n = arr.length;
		countFreq(arr, n);
	}
}

