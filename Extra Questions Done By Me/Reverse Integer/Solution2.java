class Solution {
    public int reverse(int x) {
        if(x<=Integer.MIN_VALUE || x>=Integer.MAX_VALUE)
            return 0;
        else
        {
            int rem;
            long sum=0;
            while(x!=0)
            {
                rem = x % 10;
                sum = (sum*10) + rem;
                if(sum<= Integer.MIN_VALUE || sum>= Integer.MAX_VALUE)
                    return 0;
                x /= 10;
            }
            return (int)sum;
        }
    }
}