class Solution {
    public int thirdMax(int[] nums) 
    {
          //sort & return --> 0(nlogn);
          PriorityQueue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
          for(int n:nums)
          {
             if(!q.contains(n)){
                 q.add(n);
             }
          }
         System.out.println(q);
        
        int max=q.poll();
        if(q.size()<2)
            return max;
        
        q.poll();
        
        return q.poll();
        
    }
}