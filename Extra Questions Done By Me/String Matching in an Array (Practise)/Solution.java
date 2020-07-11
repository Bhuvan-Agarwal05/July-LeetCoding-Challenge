class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for(String s:words)
        {
            for(String sp:words)
            {
                if(!s.equals(sp))
                {
                    if(sp.contains(s))
                    {
                        list.add(s);
                        break;
                    }
                }
            }
        }
        
        return list;
    }
}