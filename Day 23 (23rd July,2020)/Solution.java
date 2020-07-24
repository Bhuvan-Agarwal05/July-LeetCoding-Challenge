class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i:nums)
        {
            if(list.contains(i))
                list.remove(new Integer(i));
            else
                list.add(i);
        }
        
       int[] output = new int[2];
       output[0] = list.get(0);
       output[1] = list.get(1);
        
        return output;
    }
}