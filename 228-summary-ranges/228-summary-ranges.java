class Solution {
    public List<String> summaryRanges(int[] nums) 
    {
        List<String> l= new ArrayList<>();
        int i=0;
        while(i<=nums.length-1)
        {
          int j=i+1;
          if(j>nums.length-1)
          {
             l.add(Integer.toString(nums[i]));
              break;
          }
          if(nums[j]==nums[i]||nums[j]-nums[i]>1){
           l.add(Integer.toString(nums[i]));
              i++;
          }
          else{
          while(j<nums.length-1)
          {
              if(Math.abs(nums[j]-nums[j+1])>1)
              {
                  break;
              }
              j++;
          }
            l.add(Integer.toString(nums[i])+"->"+Integer.toString(nums[j]));
            i=j+1;
         }
        }
        return l;
    }
}