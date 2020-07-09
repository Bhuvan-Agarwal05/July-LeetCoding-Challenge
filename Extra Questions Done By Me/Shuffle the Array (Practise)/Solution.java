class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l1 = 0;
        int l2 = n;
        
        int[] output = new int[2*n];
        
        int i=0;
        while(l1<n && l2<nums.length)
        {
            output[i] = nums[l1];
            output[i+1] = nums[l2];
            i+=2;
            l1++;
            l2++;
        }
        return output;
    }
}