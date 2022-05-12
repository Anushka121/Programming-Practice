class Solution {
    public int findKthLargest(int[] nums, int k) 
    {
      PriorityQueue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
        for(int val:nums)
        {
            q.add(val);
        }
        if(k==0|| k>q.size())return 0;
        
        while(k!=1)
        {
            k--;
            q.poll();
        }
        if(q.isEmpty())return 0;
        else return q.peek();
    }
}