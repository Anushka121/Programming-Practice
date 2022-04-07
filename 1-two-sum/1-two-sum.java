class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        int[] index= new int[2];
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(nums[0],0);
        for(int i=1;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
               index[0]=map.get(target-nums[i]);
               index[1]=i;
            }
            //System.out.println(map);
            map.put(nums[i],i);
        }
        return  index;
    }
}