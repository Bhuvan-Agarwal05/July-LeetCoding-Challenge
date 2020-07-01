class Solution {
    public int arrangeCoins(int n) {
        // It is more like a Mathematical Problem Rather than just coding
        
        long temp = (long)Math.sqrt(2*(long)n);
        long sum = temp*(temp+1)/2;
        if(sum>n)
            return (int)(temp-1);
        else
            return (int)temp;
        
    }
}