class Solution {
    List<List<Integer>> result= new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums)
    {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i==0||nums[i-1]!=nums[i])
            {
                tryTwoSum(i+1,nums.length-1,nums,0-nums[i]);
            }
        }
        return result;
        
    }
    public void tryTwoSum(int s,int e,int[]nums,int target)
    {
        int val=nums[s-1];
        
         while(s<e)
         {
             if(nums[s]+nums[e]==target)
             {
                 ArrayList<Integer> l= new ArrayList<>();
                 l.add(val);
                 l.add(nums[s]);
                 l.add(nums[e]);
                 result.add(l);
                 //ignore duplicate
                while(s<e &&nums[s]==nums[s+1]) s++;
                
                while(s<e &&nums[e]==nums[s-1]) e--;
                s++;
                e--;
             }
            else if(nums[s]+nums[e]>target)
             {
                 e--;
             }
             else
             {
                 s++;
             }
         }
    }
}