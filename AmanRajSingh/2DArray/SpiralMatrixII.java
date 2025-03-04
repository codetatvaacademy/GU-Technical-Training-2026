class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int r = 0, r1 = n - 1;
        int c = 0, c1 = n - 1;
        int num = 1;
        
        while (r <= r1 && c <= c1) {
            for (int j = r; j <= r1; j++) {
                matrix[c][j] = num++;
            }
            c++; 
            for (int i = c; i <= c1; i++) {
                matrix[i][r1] = num++;
            }
            r1--;
            
            if (c <= c1) {
                for (int j = r1; j >= r; j--) {
                    matrix[c1][j] = num++;
                }
                c1--; 
            }
            
            if (r <= r1) {
                for (int i = c1; i >= c; i--) {
                    matrix[i][r] = num++;
                }
                r++; 
            }
        }
        
        return matrix;
    }
}
