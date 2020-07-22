class Solution {
    public String generateTheString(int n) {
        StringBuffer sp = new StringBuffer("");
        if(n%2==1)
        {
            for(int i=0;i<n;i++)
                sp.append('a');
            return sp.toString();
        }
        else
        {
            for(int i=0;i<n-1;i++)
                sp.append('a');
            sp.append('b');
            return sp.toString();
        }
    }
}