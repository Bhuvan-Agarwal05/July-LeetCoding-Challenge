class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int[] arr:grid)
        {
            int low = 0;
            int high = arr.length-1;
            int mid = 0;
            int idx=-1;
            while(high>=low)
            {
                mid = low + (high-low)/2;
                if(arr[mid] < 0 )
                {
                    idx = mid;
                    high=mid-1;
                }
                else
                    low = mid+1;
            }
            if(idx!=-1)
            count += arr.length-idx;
        }
        
        return count;
    }
}