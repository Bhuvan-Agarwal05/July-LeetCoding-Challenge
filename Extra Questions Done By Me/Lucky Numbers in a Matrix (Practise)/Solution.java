class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minRowIndex = -1;
        int minColumnIndex = -1;
        
        for(int i=0;i<row;i++)
        {
            min = Integer.MAX_VALUE;
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j] < min)
                {
                    min = matrix[i][j];
                    minRowIndex = i;
                    minColumnIndex = j;
                }
            }
            
            max = Integer.MIN_VALUE;
            for(int j=0;j<row;j++)
            {
                if(matrix[j][minColumnIndex] > max)
                    max = matrix[j][minColumnIndex];
            }
            if(max == matrix[minRowIndex][minColumnIndex])
                output.add(max);
        }
       return output; 
        
    }
}