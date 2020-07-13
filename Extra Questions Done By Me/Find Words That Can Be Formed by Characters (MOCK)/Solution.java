class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:chars.toCharArray())
        {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        
        int count=0;
        int flag=0;
        HashMap<Character,Integer> temp;
        for(String s:words)
        {
            flag=0;
            temp = new HashMap<>();
            for(char c:s.toCharArray())
            {
                if(temp.containsKey(c))
                    temp.put(c,temp.get(c)+1);
                else
                    temp.put(c,1);
            }
            
            for(char c:temp.keySet())
            {
                if(map.containsKey(c))
                {
                    if(map.get(c)<temp.get(c))
                    {
                        flag=1;
                        break;
                    }
                }
                else
                {
                    flag=1;
                    break;
                }
            }
            
            if(flag!=1)
                count+= s.length();
        }
        
        return count;
    }
}