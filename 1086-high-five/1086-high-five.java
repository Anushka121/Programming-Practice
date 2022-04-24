class Solution {
    public int[][] highFive(int[][] items) 
    {
        HashMap<Integer,List<Integer>> map= new HashMap<>();
        
        for(int[] val:items)
        {
            if(map.containsKey(val[0]))
            {
                List<Integer> l= map.get(val[0]);
                l.add(val[1]);
                map.put(val[0],l);
            }
            else
            {   List<Integer> l= new ArrayList<>();
                l.add(val[1]);
                map.put(val[0],l);
            }
        }
        
        for(Integer key:map.keySet())
        {
            Collections.sort(map.get(key),Collections.reverseOrder());
        }
        int k=0;
      int[][] result=new int[map.size()][2];
        for(Integer key:map.keySet())
        {
            int avg=av(map.get(key));
            result[k][0]=key;
            result[k][1]=avg;
            k++;
        }
        
        return result;
    }
    public int av (List<Integer> l)
    {
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum+=l.get(i);
        }
        
        return sum/5;
    }
}