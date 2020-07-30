class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) 
            return 0;
        
        int A = 0, B = -prices[0], C = 0;
        for(int i = 1; i < prices.length; ++i)
        {
            int tmp = A;
            A = Math.max(A, C);
            C = B + prices[i];
            B = Math.max(B, tmp - prices[i]);
        }
        return Math.max(A, C);
    }
}