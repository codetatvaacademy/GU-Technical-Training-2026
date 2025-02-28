class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            for(int j  = 0; j < 9; j++){
                if(!isValid(i , j , board)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(int row , int col , char[][] board){
        if(board[row][col] == '.') return true;

        for(int i = 0; i < 9; i++){
            if(col!=i && board[row][i]==board[row][col]) return false;
            if(row!=i && board[i][col] == board[row][col]) return false;
            if((3*(row/3)+i/3) != row && (3*(col/3) + i % 3) !=col && board[3*(row/3)+i/3][3*(col/3) + i % 3] == board[row][col]) return false;
        }
        return true;
    }
}