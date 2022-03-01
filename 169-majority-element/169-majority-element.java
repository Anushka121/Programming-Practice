class Solution {
    public int majorityElement(int[] nums)
    {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int val:nums)
            map.put(val,map.getOrDefault(val,0)+1);
        for(Integer key:map.keySet())
        {
            if(map.get(key)>nums.length/2) return key;
        }
        
        return 0;
    }
}