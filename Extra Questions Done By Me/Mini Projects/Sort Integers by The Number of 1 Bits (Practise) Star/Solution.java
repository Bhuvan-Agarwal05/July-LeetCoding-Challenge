class Solution {
    public int[] sortByBits(int[] arr) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        int c = 0;
        for(int i:arr)
        {
            c = countSetBits(i);
            if(map.containsKey(c))
            {
                List<Integer> list = map.get(c);
                list.add(i);
                map.put(c,list);
            }
            
            else
            {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(c,list);
            }
        }
        
        
        List<Integer> l = new ArrayList<>();
        for(int i:map.keySet())
        {
            //System.out.println(i +" "+map.get(i));
            if(map.get(i).size()>1)
            {
                List<Integer> list = map.get(i);
                Collections.sort(list);
                l.addAll(list);
            }
            else
                l.addAll(map.get(i));
        }
        
        int[] output = new int[l.size()];
        for(int i=0;i<l.size();i++)
            output[i] = l.get(i);
        
        return output;
    }
   
    
    // Brian Kernighan’s Algorithm:   https://www.geeksforgeeks.org/count-set-bits-in-an-integer/
    public int countSetBits(int n) 
    { 
        int count = 0; 
        while (n > 0) 
        { 
            n &= (n - 1); 
            count++; 
        } 
        return count; 
    } 
}