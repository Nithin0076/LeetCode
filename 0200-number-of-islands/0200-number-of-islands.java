class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int c = 0;
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(grid[i][j] == '1')
                {
                    island(grid, i, j);
                    c++;
                }
                    
            }
        }
        return c;
    }
    
    static void island(char grid[][], int i, int j)
    {
        int m = grid.length;
        int n = grid[0].length;
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
            island(grid,i,j+1);
            island(grid,i,j-1);
            island(grid,i-1,j);
            island(grid,i+1,j);
    }
}