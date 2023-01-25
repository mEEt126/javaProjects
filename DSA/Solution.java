class Solution {
    public int[] arrayRankTransform(int[] arr) 
    {
       int copiedArr[] = new int[arr.length]; 
       int resArr[] = new int[arr.length]; 
       int Rank = 0,lastElement = -1024,index=0; 
       for(int i=0; i<arr.length; i++)
       {
           copiedArr[i] = arr[i]; 
       }     
       Arrays.sort(copiedArr); 
       for(int i=0; i<arr.length; i++)
       {
           if(lastElement != copiedArr[i])
           {
               Rank++; 
           }
           index = search(arr, copiedArr[i]);
           //System.out.print(index + " "); 
           resArr[index] = Rank;  
           arr[index] = -1024;  
           lastElement = copiedArr[i];  
       }
       /*for(int i=0; i<arr.length; i++)
       {
           System.out.print(arr[i] + " ");  
       } */ 
       return resArr; 
    }
    public static int search(int a[], int key)
    {
        for(int i=0; i<a.length; i++)
        {
            if(a[i] == key)
                return i; 
        }
        return -1; 
    }
}
