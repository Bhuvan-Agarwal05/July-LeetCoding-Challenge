class Solution {
    public boolean isPalindrome(int x) {
        String s = x +"";
        StringBuffer sp = new StringBuffer();
        
        for(int i=s.length()-1;i>=0;i--)
            sp.append(s.charAt(i));
        
        return s.equals(sp.toString());
    }
}