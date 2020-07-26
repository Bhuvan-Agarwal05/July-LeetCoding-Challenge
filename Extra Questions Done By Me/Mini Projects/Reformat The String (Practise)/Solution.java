class Solution {
    public String reformat(String s) {
        ArrayList<Character> alpha = new ArrayList<>();
        ArrayList<Character> digit = new ArrayList<>();
        for(char ch:s.toCharArray())
        {
            if(ch>='a' && ch<='z')
                alpha.add(ch);
            else
                digit.add(ch);
        }
        
        if( (alpha.size()==digit.size()) || (Math.abs(alpha.size()-digit.size())==1) )
        {
            int i=0;
            StringBuffer sp = new StringBuffer("");
            if(digit.size()>alpha.size())
            {
                while(i<alpha.size())
                {
                    sp.append(digit.get(i));
                    sp.append(alpha.get(i));
                    i++;
                }
               sp.append(digit.get(i));
            }
            else if(digit.size()==alpha.size())
            {
               while(i<alpha.size())
                {
                    sp.append(digit.get(i));
                    sp.append(alpha.get(i));
                    i++;
                }
            }
            else
            {
               while(i<digit.size())
                {
                    sp.append(alpha.get(i));
                    sp.append(digit.get(i));
                    i++;
                }
                sp.append(alpha.get(i)); 
            }
            return sp.toString();
        }
        else
            return "";
    }
}