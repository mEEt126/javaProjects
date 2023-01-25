public class SearchInsertPosition{
    public int searchInsert(int[] nums, int target) 
    {
        int lo=0, hi=nums.length-1, mid=0, index=0;
        index = Arrays.binarySearch(nums, target);
            if(index >=0 )
                return index; 

        if(nums[hi] < target)
            return hi+1; 
        else if(nums[lo] > target)
            return 0;     

        while(lo<=hi)
        {
            if(target<nums[lo])
            {
                return lo; 
            }
            lo++; 
        }
        return 0;     
    }
}
