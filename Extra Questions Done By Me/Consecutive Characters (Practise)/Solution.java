class Solution {
    public int maxPower(String s) {
        int max = 1;
        int count=1;
        
        for(int i=0;i<s.length()-1;i+=count)
        {
            count=1;
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i) == s.charAt(j))
                    count++;
                else
                    break;
            }
            
            if(count>max)
                max = count;
        }
        return max;
    }
}