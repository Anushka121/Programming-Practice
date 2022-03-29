class Solution {
    public int findDuplicate(int[] nums)
    {
        int prev=-1;
        Arrays.sort(nums);
        for(int val:nums)
        {
            if(prev==val)return val;
            prev=val;
        }
        return prev;
    }
}