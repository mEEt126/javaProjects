public class ReversePair{
    public int reversePairs(int[] nums) 
    {
        int i=0,j=0,count=0; 
        
        for(i=0;  i<nums.length-1; i++)
        {
            for(j=i+1; j<nums.length; j++)
            {
                if((long)nums[i] > (long)2*nums[j])
                {
                    count++; 
                    //System.out.print(count + " "); 
                }
            }
            System.out.print(count + " ");
        }        
        return count; 
    }
}
