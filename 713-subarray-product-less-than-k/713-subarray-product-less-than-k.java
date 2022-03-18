class Solution {
    
    public int numSubarrayProductLessThanK(int[] nums, int k)
    {  int i=0;
       int count=0;
       while(i<nums.length)
       {
           int j=i;
           int prod=1;
           while(j<nums.length)
           {
                prod*=nums[j];
               if(prod<k)
                   count++;
                else
                   break;
               j++;
           }
          i++;
       }
     return count;
    }
}