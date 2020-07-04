class Solution {
    public int reverse(int x) {
        if(x==0)
            return x;
        else if(x>0)
        {
            String s = Integer.toString(x);
            StringBuffer sp = new StringBuffer("");
            for(int i=s.length()-1;i>=0;i--)
                sp.append(s.charAt(i));
            
            if(Long.parseLong(sp.toString()) > Integer.MAX_VALUE)
                return 0;
            else
                return Integer.parseInt(sp.toString());
        }
        else
        {
            String s = Integer.toString(x);
            StringBuffer sp = new StringBuffer("");
            sp.append('-');
            for(int i=s.length()-1;i>0;i--)
                sp.append(s.charAt(i));
            if( Long.parseLong(sp.toString()) < Integer.MIN_VALUE)
                return 0;
            else
                return Integer.parseInt(sp.toString());  
        }
    }
}