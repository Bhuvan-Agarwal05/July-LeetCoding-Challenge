class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        N = N%14==0?14:N%14;
        for(int i=0;i<N;i++)
        {
            cells = change(cells);
        }
        return cells;
    }
    
    private int[] change(int[] cells)
    {
        int[] temp = new int[cells.length];
        temp[0] = 0;
        temp[7] = 0;
        for(int i=1;i<cells.length-1;i++)
        {
            if( ( cells[i-1]== 1 && cells[i+1]==1 ) || ( cells[i-1]==0 && cells[i+1]==0 ) )
                temp[i] = 1;
            else
                temp[i] = 0;
        }
        return temp;
    }
}