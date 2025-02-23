import java.util.Scanner;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][] boxes = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currVal = board[i][j];
                if (currVal != '.') {
                    int num = currVal - '1';
                    int boxIndex = (i / 3) * 3 + (j / 3);

                    if (rows[i][num]++ > 0 || cols[j][num]++ > 0 || boxes[boxIndex][num]++ > 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void userInput() {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[9][9];

        for (int i = 0; i < 9; i++) {
            String row = scanner.next();
            for (int j = 0; j < 9; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        System.out.println(isValidSudoku(board));
        scanner.close();
    }
}
