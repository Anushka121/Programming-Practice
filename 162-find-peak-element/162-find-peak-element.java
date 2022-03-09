class Solution {
    public int findPeakElement(int[] nums)
    {
        int peak=-1;
        if(nums.length==1)return 0;
        if(nums.length==2) 
        {
            if(nums[0]>nums[1])return 0;
            else return 1;
        }
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i-1]<nums[i]&&nums[i+1]<nums[i])
            {
              peak=i;
            } 
        }
        
        if(peak==-1)
        {
            if(nums[0]>nums[1])
                peak=0;
            else
            {
               if(nums[nums.length-1]>nums[nums.length-2])
                peak=nums.length-1;
            }
        }
        return peak;
    }
}