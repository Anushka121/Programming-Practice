class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> c=null;
        List<Integer> p=null;
        for(int i=0;i<numRows;i++)
        {
         c= new ArrayList<>();
         for(int j=0;j<=i;j++)
         {
             
             if(j==i||j==0)
             {
                 c.add(1);
             }
             else
             {
                c.add(p.get(j-1)+p.get(j));
             }
         }
         ans.add(c);
         p=c;
         
        }
        return ans;
    }
}