class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> res= new ArrayList<>();
       Set<List<Integer>> set = new HashSet<>();
       if(nums.length < 3)
            return res;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                        ArrayList<Integer> a= new ArrayList<>();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[k]);
                        set.add(a);
                        j++;
                        k--;
                    }
                  else  if(nums[i]+nums[j]+nums[k]<0)
                  {
                     j++; 
                  }
                 else
                  {
                      k--;
                  }
            }
        }
        
          
        for(List<Integer> list : set)
            res.add(list);
        return res;
    }
}