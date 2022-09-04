class Solution {
    public List<Integer> getRow(int rowIndex) 
    {
        List<List<Integer>> pascalTriangle= new ArrayList<>();
        List<Integer> current, prev=null;
        
        for(int i=0;i<=rowIndex;i++)
        {
           current= new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                   current.add(1);
                }
                else
                {
                    int val=prev.get(j-1)+prev.get(j);
                    current.add(val);
                }
            }
            prev=current;
             pascalTriangle.add(current);
        }
        return pascalTriangle.get(pascalTriangle.size()-1);
    }
}