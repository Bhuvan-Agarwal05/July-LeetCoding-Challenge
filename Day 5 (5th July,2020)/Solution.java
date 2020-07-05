class Solution {
    public int hammingDistance(int x, int y) {
        
        /*
            Approach:
                Calculate the XOR of two numbers.
                Count the number of set bits.
        */
        
        /*  This is also working but not optimized
        
        String s = Integer.toBinaryString(x^y);
        int count=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='1')
                count++;
        
        return count;
        
        */
        
        int temp = x^y;
        int count = 0;
        while(temp>0)
        {
            count += temp & 1;
            temp >>= 1;
        }
        return count;
    }
}