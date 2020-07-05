class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        if(pattern.length()!=s.length)
            return false;
        else
        {
            ArrayList<Character> list = new ArrayList<>();
            HashMap<String,Character> map = new HashMap<>();
            for(int i=0;i<s.length;i++)
            {
                if(map.containsKey(s[i]))
                {
                    char ch = map.get(s[i]);
                    if(ch!=pattern.charAt(i))
                        return false;
                }
                else
                {
                    if(list.contains(pattern.charAt(i)))
                        return false;
                    map.put(s[i],pattern.charAt(i));
                    list.add(pattern.charAt(i));
                }
            }
            return true;
        }
    }
}