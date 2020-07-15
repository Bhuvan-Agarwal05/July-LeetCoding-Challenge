class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll(" +"," ");  // To replace all multiple spaces with single space
        String[] str = s.split(" ");
        StringBuffer sp = new StringBuffer("");
        int i;
        for(i=str.length-1;i>0;i--)
                sp.append(str[i]+" ");
        sp.append(str[i]);
        
        return sp.toString();
    }
}