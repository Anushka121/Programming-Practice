class Solution {
    public boolean judgeCircle(String moves)
    {
        int cord[][]=new int[1][2];
        
        
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='L')
                {
                  cord[0][0]+=-1;
                   cord[0][1]+=0;
                }
                
               else if(moves.charAt(i)=='U')
               {
                   cord[0][0]+=0;
                   cord[0][1]+=1;
               }
                  else  if(moves.charAt(i)=='D')
                  {
                      cord[0][0]+=0;
                      cord[0][1]+=-1;
                  }
                      else  if(moves.charAt(i)=='R')
                      {
                          cord[0][0]+=1;
                          cord[0][1]+=0;
                      }
            
        }
        if(cord[0][0]==0&&cord[0][1]==0)return true;
        else return false;
    }
}