class Solution {
    
    public boolean isSubsequence(String s, String t)
    {
       //if(s length is greater than t length)
        if(s.length()>t.length())return false;
       // find lcs length;
       int lc=lcs(t,s);
        //if(not equals)lc
       // System.out.println(lc);
       if(s.length()!=lc)return false;
       else return true;
    }
    // find lcs
    public int lcs(String t,String s)
    {
        int sl=s.length();
        int tl=t.length();
        
        int dp[][]= new int[sl+1][tl+1];
        
        //Base condition
        for(int i=0;i<=sl;i++)
        {
            for(int j=0;j<=tl;j++)
            {
                if(i==0||j==0)
                {
                    dp[i][j]=0;
                }
            }
        }
        //
        for(int i=1;i<=sl;i++)
        {
            for(int j=1;j<=tl;j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
                {
                   dp[i][j]=1+dp[i-1][j-1];
                }
                else
                { 
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    
                }
            }
        }
        return dp[sl][tl];
    }
    
}