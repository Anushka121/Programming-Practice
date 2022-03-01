class Solution {
    public int[] countBits(int n)
    {
        int dp[]= new int[n+1];
        countBits(dp,0);
        return dp;
    }
    public void countBits(int[] dp,int n)
    {
        if(n==dp.length)return;
        String s=Integer.toString(n,2);
        int count1=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')count1++;
        }
        dp[n]=count1;
        countBits(dp,n+1);
    }
}