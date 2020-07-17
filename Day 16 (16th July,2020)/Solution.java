class Solution {
    public double myPow(double x, int n) {
        return findPow(x,n);
    }
    
    private double findPow(double x,long n)
    {
        if(n==0)
            return 1;
        if(n==1)
            return x;
        if(n<0)
            return findPow(1/x,-n);
        double ans = findPow(x*x,n/2);
        if(n%2==1)
            return ans *= x;
        return ans;
    }
}