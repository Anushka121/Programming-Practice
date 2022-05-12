class Solution {
    public int maxProfit(int[] prices) 
    {
        int profit=0;
        int maxProfit=0;
        for(int i=0;i<prices.length-1;i++ )
        {
            int diff=prices[i+1]-prices[i];
            profit+=diff;
            maxProfit=Math.max(maxProfit,profit);
            if(profit<=0)
            {
                profit=0;
            }
        }
        return maxProfit;
    }
}