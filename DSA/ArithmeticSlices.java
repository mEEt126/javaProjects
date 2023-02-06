//  [1,2,3,4]

class ArithmeticSlices{
    public int numberOfArithmeticSlices(int[] nums) 
    {
        ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();

        // call a fuc to cal subArrs
        for(int size=3; size<=nums.length; size++)
        {
            findArithSubArr(nums, size, l); 
        }    

        return l.size();     
    }

    public static void findArithSubArr(int nums[], int size, ArrayList<ArrayList<Integer>> l)
    {
        //System.out.println(size); 
        boolean flag; 
        for(int i=0; i<=(nums.length-size); i++) // condition
        {
            int diff=nums[i+1] - nums[i], curDiff=0; 
            //System.out.println(diff);
            flag = true;  
            for(int k=i; k<size-1+i; k++)
            {
                curDiff = nums[k+1] - nums[k]; 
                //System.out.print(curDiff + " "); 
                if(curDiff != diff)
                {
                    flag = false;
                    break;  
                } 
            }
            //System.out.println(flag); 
            if(flag == true)
            {   
                ArrayList<Integer> temp = new ArrayList<>();
                for(int k=i; k<size+i; k++)
                {
                    temp.add(nums[k]); 
                }
                //System.out.println(temp.toString()); 
                l.add(temp);  
            }  
        }
    }
} 
