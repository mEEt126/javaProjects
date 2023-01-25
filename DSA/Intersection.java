class Intersection{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
            int resArr[] = new int[Math.min(nums1.length, nums2.length)]; 
            int count=0;
            Arrays.sort(nums1);
            Arrays.sort(nums2); 

            // 		sorted array 
            //    1 <= nums1.length, nums2.length <= 1000
            //    0 <= nums1[i], nums2[i] <= 1000

            for(int i=0; i<resArr.length; i++)
            {
                resArr[i] = 2000; 
            }

            if(nums1.length > nums2.length)
            {
                for(int i=0; i<nums2.length; i++)
                {
                    if(Arrays.binarySearch(nums1, nums2[i]) >=0 && Arrays.binarySearch(resArr, nums2[i]) < 0)
                    {
                        resArr[count++] = nums2[i]; 
                    }
                }
            }
            else
            {
                for(int i=0; i<nums1.length; i++)
                {
                    if(Arrays.binarySearch(nums2, nums1[i]) >=0 && Arrays.binarySearch(resArr, nums1[i]) < 0)
                    {
                        resArr[count++] = nums1[i]; 
                    }
                }
            }       

            if(count < Math.min(nums2.length, nums1.length))
            {
                int arr[] = new int[count]; 
                for(int i=0; i<count; i++)
                {
                    arr[i] = resArr[i];
                } 
                return arr;
            }
            else
                return resArr; 
    }   
}
