class Solution {
    public int[] productExceptSelf(int[] nums) {
        int flag=0;
        int prod = 1;
        int count=0;
        int[] output = new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                flag=1;
                count++;
            }
            else
                prod *= nums[i];
        }
        
        if(flag==1)
        {
            if(count>1)
                return output;
            else if(count==1)
            {
                for(int i=0;i<nums.length;i++)
                {
                    if(nums[i]==0)
                        output[i] = prod;
                }
                return output;
            }
        }
        else
        {
            for(int i=0;i<nums.length;i++)
                output[i] = prod/nums[i];
            
            return output;
        }
        return output;
    }
}