class Pair
{
    int x;
    int y;
    Pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int[][] merge(int[][] intervals) 
    {
       if(intervals.length<=1)return intervals;
         Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        Stack<Pair> stack= new Stack<>();
        for(int [] interval:intervals)
        {
            Pair p= new Pair(interval[0],interval[1]);
            if(stack.isEmpty())
            {
                stack.push(p);
            }
            else
            {
                Pair p1= stack.peek();
                if(p1.y>=p.x)
                {
                    stack.pop();
                    stack.push(new Pair(p1.x,Math.max(p1.y,p.y)));
                }
                else
                {
                    stack.push(p);
                }
            }
            
        }
        int[][] result= new int[stack.size()][2];
        for(int i=0;i<stack.size();i++)
        {
              Pair p= stack.get(i);
              result[i][0]=p.x;
              result[i][1]=p.y;
              
        }
        return result;
    }
}