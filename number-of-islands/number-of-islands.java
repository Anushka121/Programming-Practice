class Solution {
    public int numIslands(char[][] grid) 
    {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='1')
                {
                      count++;
                     checkAdjacents(grid,i,j);
                }
            }
        }
        return count;
    }
    public void checkAdjacents(char[][]grid ,int r,int c)
    {
    int rn = grid.length;
    int cn = grid[0].length;
       if(r<0 || c<0 ||r>=rn ||c>=cn ||grid[r][c]=='0')return;
       grid[r][c]='0';
      checkAdjacents(grid,r+1,c);
      checkAdjacents(grid,r-1,c);
      checkAdjacents(grid,r,c+1);
      checkAdjacents(grid,r,c-1);
    }
}