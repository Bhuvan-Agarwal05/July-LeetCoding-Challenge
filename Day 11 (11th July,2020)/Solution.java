class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>());  // add empty subset to your answer set
        
        for(int i=0; i<nums.length; i++)
        {
            int size=output.size(); //store the current size (as arraylist is dynamic if you directly use size() in your for loop then this will lead to infinite loop beacause size will be keep growing
            for(int j=0;j<size;j++)
            {
                List<Integer> val = new ArrayList<>(output.get(j)); //get the previous elements of the subset at j'th position
                val.add(nums[i]);  //add the current item 
                output.add(val); // now add this new subset to answer set
            }
        }
        return output;
    }
}