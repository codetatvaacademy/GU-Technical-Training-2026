import java.util.*;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    if (!seen.add(num + " in row " + i) ||
                        !seen.add(num + " in col " + j) ||
                        !seen.add(num + " in box " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[9][9];

        for (int i = 0; i < 9; i++)
            board[i] = sc.next().toCharArray();

        System.out.println(isValidSudoku(board));
        sc.close();
    }
}
