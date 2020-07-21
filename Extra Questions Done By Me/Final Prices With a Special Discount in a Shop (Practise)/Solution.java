class Solution {
    public int[] finalPrices(int[] prices) {
        int i,j;
        for(i=0;i<prices.length;i++)
        {
            for(j=i+1;j<prices.length;j++)
            {
                if(prices[i]>=prices[j])
                    break;
            }
            if(j>i && j<prices.length)
                prices[i] -= prices[j];
        }
        
        return prices;
    }
}