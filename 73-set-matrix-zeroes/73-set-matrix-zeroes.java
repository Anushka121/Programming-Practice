
class Solution {
    public void setZeroes(int[][] matrix) 
    {
      Queue<int[]> q= new LinkedList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    q.add(new int[]{i,j});
                }
            }
             
        }
        while(q.isEmpty()!=true){
            int x=q.peek()[0];
            int y=q.peek()[1];
            q.poll();
            
            for(int i=0;i<matrix[0].length;i++){
                matrix[x][i]=0;
            }
            for(int i=0;i<matrix.length;i++){
                matrix[i][y]=0;
            }
        }
    }
}