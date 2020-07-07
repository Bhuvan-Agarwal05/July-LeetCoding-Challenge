class Solution {
    int row = 0;
    int col = 0;
    public int islandPerimeter(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        int peri = 0;
        int count = 0;
        
        for(int i=0;i<row;i++)
        {
            count=0;
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==1)
                {
                    count = connectedLand(grid,i,j);
                    peri += (4 - count);
                }
            }
        }
        return peri;
    }
    
    private int connectedLand(int[][] grid,int i,int j)
    {
        int count=0;
        if(i>0)
        {
            if(grid[i-1][j]==1)
                count++;   
        }
        if(i+1<row)
        {
            if(grid[i+1][j]==1)
                count++; 
        }
        if(j>0)
        {
            if(grid[i][j-1]==1)
                count++;   
        }
        if(j+1<col)
        {
            if(grid[i][j+1]==1)
                count++;   
        }
        
        return count;
    }
}