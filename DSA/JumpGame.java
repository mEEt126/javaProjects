class JumpGame{
    public int jump(int[] nums) 
    {
        int i=0,j=0,MaxSum=0, minJump=0,jumpToIndex,preIndex;
        boolean ifChanged = false; 

        if(nums.length == 1)        // edge cases 
            return 0; 
        else if(nums[0] == 0)
            return 0; 
        else if(nums[0] >= nums.length-1)
            return 1;   

        while(i<nums.length-1)      
        {
            j = nums[i];                        // currentIndex = i; 
            jumpToIndex = i;                 // MaxSum = i + nums[i];
            preIndex = i; 
            MaxSum = i + nums[i];                 // i++;  
            i++; 

            while(j-->0)
            {
                if(nums[i] == 0)        // need to think about edge cases 
                {
                    i++;
                    continue; 
                }    

                int sum = i + nums[i]; 
                if(sum > MaxSum)
                   { 
                       MaxSum = sum;
                       ifChanged = true;  
                       jumpToIndex = i ; 
                        //minJump++;   // increment jump outside not here
                   }   

                if(j>0)
                    i++;     
            } 

            if(jumpToIndex != preIndex) 
            {
                i = jumpToIndex;       // jump to ith position 
                minJump++; 
            }    
            //System.out.println(minJump); 

            if(MaxSum >= nums.length-1)
            {
                minJump++; 
                System.out.println(minJump); 
                return minJump;
            }     
            
            /*if(ifChanged == false)
                return false; 
            else
                ifChanged = false;*/            
        }        
        return minJump;
    }
}
