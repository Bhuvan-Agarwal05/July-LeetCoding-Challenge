class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       int n = nums.length;
       if(n < 3) return new ArrayList<List<Integer>>();
       List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < n-2; ++i)
        {
            if(i == 0 || nums[i] != nums[i-1])
            {
                int j = i+1, k = n-1;
                while(j < k)
                {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0) 
                    {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while(j < k && nums[j] == nums[j+1]) 
                            j++;
                        while(j < k && nums[k] == nums[k-1]) 
                            k--;
                        j++; 
                        k--;
                    }
                    else if (sum < 0) 
                        j++;
                    else 
                        k--;
                }
            }
        }
        return result;
        
        // Naive Approach => using 3 loops => O(n^3)
        // Sorting the array and fixing (i) & (j) and finding whether  "-(nums[i]+nums[j])" exists in the other part of the array using Binary Search as the Array is Sorted => O(nlogn) + (n^2logn) => O(n^2logn)
        // Total Time Taken here is => O(nlogn) + O(n^2)  => O(n^2)
    }
}