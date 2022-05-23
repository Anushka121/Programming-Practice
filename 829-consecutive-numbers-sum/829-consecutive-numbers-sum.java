class Solution {
    public int consecutiveNumbersSum(int n)
    {
        // x+x+1+x+2------x+k-1=n;
        //xk+0+1+2---k-1=n;
        //xk+k(k-1)/2=n
        //x=(n-k(k-1)/2)/k
        //if x>0
        //n-k(k-1)/2>0;
        int count=0;
        for(int k=1;(n*2)-k*(k-1)>0;k++)
        {
            int num=n-((k-1)*k)/2;
            if(num%k==0)
            {
                count++;
            }
        }
        return count;
    }
}