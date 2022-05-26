
class Solution {
    public boolean exist(char[][] board, String word)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                char c= board[i][j];
                if(c==word.charAt(0) && checkAdj(board,i,j,0,word))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean checkAdj(char[][] board,int i,int j,int count,String word)
    {
        //if(coun)
        if(count==word.length())return true;
        if(i<0|| j<0 ||i>=board.length ||j>=board[i].length|| board[i][j]!=word.charAt(count))
            {
                return false;
            }
        
        
        char temp=board[i][j];
        board[i][j]=' ';
        
        boolean found= checkAdj(board,i-1,j,count+1,word)||
                       checkAdj(board,i+1,j,count+1,word)||
                       checkAdj(board,i,j-1,count+1,word)||
                       checkAdj(board,i,j+1,count+1,word);
            
            board[i][j]=temp;
             return found;   
    }
}