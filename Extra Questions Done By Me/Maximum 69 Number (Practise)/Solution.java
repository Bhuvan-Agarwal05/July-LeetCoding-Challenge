class Solution {
    public int maximum69Number (int num) {
        String s = num+"";
        StringBuffer sp = new StringBuffer("");
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='6' && flag==0)
            {
                flag=1;
                sp.append('9');
            }
            else
                sp.append(s.charAt(i));
        }
        return Integer.parseInt(sp.toString());
    }
}