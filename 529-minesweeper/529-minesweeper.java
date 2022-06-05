class Solution {
    int X[]= new int[]{-1,-1,1,0,-1,1,0,1};
    int Y[]= new int[]{-1,1,-1,-1,0,1,1,0};
    public char[][] updateBoard(char[][] board, int[] click) 
    {
        //mine revealled
        if(board[click[0]][click[1]]=='M'){
            board[click[0]][click[1]]='X';
            return board;
        }
        
        //Blank //X
        if (board[click[0]][click[1]] != 'M' && board[click[0]][click[1]] != 'E') {
            return board;
        }
        
        
         revealBoard(board, click[0], click[1]);

        return board;
        
    }
    public void  revealBoard(char[][] board,int i,int j){
        //if(any condition not statisfied return)
        if(i<0 || j<0 || i>=board.length||j>=board[i].length||board[i][j]!='E'){
            return;
        }
        
        int mines=getMines(board,i,j);
        if (mines != 0) {
            board[i][j] = (char) (mines + '0');
            return;
        }
        board[i][j] = 'B';
        for (int k=0;k<8;k++) {
            revealBoard(board, i+ X[k], j + Y[k]);
        }
        
        
        
    }
    int getMines(char[][] board, int x, int y) {
        int mines = 0;
        for (int i=0;i<8;i++){
            int r = x+ X[i];
            int c = y+ Y[i];
            if (r >= 0 && r < board.length && c >= 0 && c < board[0].length && board[r][c] == 'M') {
                mines++;
            }
        }
        return mines;
    }
}