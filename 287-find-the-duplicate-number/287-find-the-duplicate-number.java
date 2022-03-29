class Solution {
    public int findDuplicate(int[] nums)
    {
        int low=1;
        int  high=nums.length;
        int duplicate=-1;
        
        while(low<=high)
        {
           int mid=low+(high-low)/2;
            int count=0;
           // System.out.println(nums[mid]);
            for(int val:nums)
            {
                if(val<=mid)
                {
                    count++;
                }
            }
            if(count>mid)
            {
                duplicate=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        
        return duplicate;
    }
}