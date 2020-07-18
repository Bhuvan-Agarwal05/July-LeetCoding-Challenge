class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length)
            return nums;
        
        int[] output = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        
        Queue<Integer> PQ = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        
        for(int i:map.keySet())
            PQ.add(i);
        
        for(int i=0;i<k;i++)
            output[i] = PQ.poll();
        
        return output;
    }
}