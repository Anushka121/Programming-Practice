
class Solution {
    public int[][] merge(int[][] interval) 
    {
        Arrays.sort(interval,new Comparator<int[]>(){
        @Override 
        public int compare(int[] first,int[] second)
        {
            if(first[0]>second[0])
            {
                return 1;
            }
            else if(first[0]==second[0])
                return 0;
                else return -1;
        }
        });
        
        Stack<int[]> st= new Stack<>();
       for(int i=0;i<interval.length;i++)
        {
            if(i==0)
            {
                st.push(interval[i]);
            }
            else
            {
                if(st.peek()[1]>=interval[i][0])
                {
                    st.peek()[1]=Math.max(interval[i][1],st.peek()[1]);
                }
               else st.push(interval[i]);
                
            }
        }
        Stack<int[]> rs=new Stack<>();
        
        while(st.isEmpty()!=true)
        {
          rs.push(st.pop());
        }
        
        int result[][]=new int[rs.size()][2];
        for(int i=0;i<result.length;i++)
        {
           result[i][0]=rs.peek()[0];
           result[i][1]=rs.peek()[1];
           rs.pop();
        }
        
        return result;
    }
}