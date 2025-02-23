class Solution {
    public boolean isValid(char[][] board, int row, int col, char ch){
        for(int i=0;i<9;i++){
            if(row!=i && board[i][col]==ch){
                return false;
            }
        }
        for(int j=0;j<9;j++){
            if(col!=j && board[row][j]==ch){
                return false;
            }
        }
        int boxRow=(row/3)*3;
        int boxCol=(col/3)*3;
        for(int i=boxRow;i<boxRow+3;i++){
            for(int j=boxCol;j<boxCol+3;j++){
                if(row!=i && col!=j && board[i][j]==ch){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(!isValid(board,i,j,board[i][j])){
                    return false;
                }
            }
        }
        return true;
    }
}