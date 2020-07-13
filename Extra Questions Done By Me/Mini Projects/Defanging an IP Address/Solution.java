class Solution {
    public String defangIPaddr(String address) {
        String[] str = address.split("\\.");
        StringBuffer sp = new StringBuffer("");
        int i;
        for(i=0;i<str.length-1;i++)
            sp.append(str[i]+"[.]");
        
        sp.append(str[i]);
        return sp.toString();
            
    }
}