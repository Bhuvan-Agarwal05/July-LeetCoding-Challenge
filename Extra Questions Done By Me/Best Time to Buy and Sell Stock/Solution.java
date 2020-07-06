class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int maxPro = 0;
        for(int i=0;i<prices.length-1;i++)
        {
            max=0;
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]>prices[i])
                {
                    max = prices[j]-prices[i];
                }
                
                if(maxPro < max)
                    maxPro = max;
            }
        }
        return maxPro;
    }
}