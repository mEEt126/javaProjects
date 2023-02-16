public class MergeSort {
    public int[] sortArray(int[] nums) 
    {
        int start = 0, end = nums.length-1; 
        return mergeSort(nums, start, end); 
    }

    public int[] mergeSort(int nums[], int start, int end)
    {
        if(start>=end)
        {
            return nums; 
        }

        int mid = start + (end-start)/2; 

        mergeSort(nums, start, mid); 
        mergeSort(nums,mid+1, end); 
        return merge(nums,start,mid,end);
    }

    public int[] merge(int nums[], int start, int mid, int end)
    {
        int leftP = start, rightP = mid+1;
        int res[] = new int[end - start + 1];
        int i=0; 
        while(leftP<=mid && rightP<=end)
        {
            if(nums[leftP] <= nums[rightP])
            {
                res[i] = nums[leftP];
                leftP++;
            }
            else
            {
                res[i] = nums[rightP];
                rightP++;  
            }
            i++; 
        }
        while(rightP<=end)
        {
            res[i++] = nums[rightP]; 
            rightP++;
        }
        while(leftP<=mid)
        {
            res[i++] = nums[leftP]; 
            leftP++;
        }
 
        for(int k=start,j=0; k<=end; k++,j++)
        {
            nums[k] = res[j]; 
        }
        return nums; 
    }
}
