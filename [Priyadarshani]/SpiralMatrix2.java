class Solution {
    public int[][] generateMatrix(int n) {
        int r1 = 0;
        int c1 = 0;
        int r2 = n- 1;
        int c2 = n- 1;
        int[][] spiralMatrix= new int[n][n];
        int nums= 1;
        
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) {
                spiralMatrix[r1][c]= nums++;
            }

            for (int r = r1 + 1; r <= r2; r++) {
                spiralMatrix[r][c2]= nums++;
            }

            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c >= c1; c--) {
                    spiralMatrix[r2][c]= nums++;
                }

                for (int r = r2 - 1; r > r1; r--) {
                    spiralMatrix[r][c1]= nums++;
                }
            }
            r1++;
            c1++;
            r2--;
            c2--;
        }
        return spiralMatrix;
    }
}
#Time complexity- O(m*n)
#Space complexity- O(m*n)
