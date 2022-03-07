class Solution {
    public int[] searchRange(int[] nums, int target)
    {
     int i=0;
     int[] target_index=new int[2];
        Arrays.fill(target_index,-1);
     int j=nums.length-1;
        
        while(i<nums.length&&j>=0)
        {
            if(nums[i]==target){
                target_index[0]=i;
            break;}
            i++;
        }
         while(j>=0)
        {
            if(nums[j]==target)
            {
                target_index[1]=j;
            break;
                }
             j--;
        }
        return target_index;
    }
}