class Solution {
    public int findMin(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i:nums)
            set.add(i);
        
        return set.first();
    }
}