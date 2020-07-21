class Solution {
    public int maxScore(String s) {
        int max = 0;
        int sum = 0;
        for(int i=1;i<s.length();i++)
        {
            String left = s.substring(0,i);
            String right = s.substring(i,s.length());
            
            sum = count(left,'0') + count(right,'1');
            if(sum>max)
                max = sum;
        }
        
        return max;
    }
    
    private int count(String s,char c)
    {
        int count = 0;
        for(char ch:s.toCharArray())
        {
            if(ch==c)
                count++;
        }
        return count;
    }
}