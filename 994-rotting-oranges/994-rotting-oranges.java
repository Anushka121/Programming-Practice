class Pair
{
   int time=0;
   int[][] index= new int[1][2];
   Pair(int time,int[][] index)
   {
     this.time=time;
     this.index=index;
   }
}

class Solution {
    public int orangesRotting(int[][] grid) 
    {
     Queue<Pair> q= new LinkedList<>();
     int X[]={-1,1,0,0};
     int Y[]={0,0,-1,1};
           int fresh=0;
            for(int i=0;i<grid.length;i++)
            {
              for(int j=0;j<grid[i].length;j++)
              {

                  if(grid[i][j]==2)
                  {
                    int[][] dex=new int[1][2];
                      dex[0][0]=i;
                       dex[0][1]=j;
                     q.add(new Pair(0,dex)) ;
                  }
                  else
                  {
                      if(grid[i][j]==1)
                      {
                          fresh++;
                      }
                  }
                 
              }
           }
        int rot=0;
        int time=0;
        while(!q.isEmpty())
           {
            rot++;
            Pair p=q.poll();
            
            
            int[][] indexes=p.index;
            // System.out.println(indexes[0][0]);
            // System.out.println(indexes[0][1]);
            
            //System.out.println(fresh+"count");
            
            for(int i=0;i<4;i++)
            {
               int x=indexes[0][0]+X[i];
               int y=indexes[0][1]+Y[i];
                
                // System.out.println(x+"x");
                // System.out.println(y+"y");
                
               if(x>=0 && y>=0 && x<grid.length &&y<grid[0].length)
               {
                 if(grid[x][y]==1)
                 { 
                   grid[x][y]=2;
                      fresh--;
                   int[][] dex=new int[1][2];
                      dex[0][0]=x;
                      dex[0][1]=y;
                   Pair pair= new Pair(p.time+1,dex);
                   q.add(pair);
                    
                     time=pair.time;
                 }
               }
            }
           }
        
    return fresh==0?time:-1;
    }
    
    
    
}