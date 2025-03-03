class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        if(original.length != (m*n)){
            return new int[0][0];
        }
        int i = 0 , j = 0;
        for(int num : original){
            result[i][j++] = num;
            if(j >= n){
                j = 0;
                i++;
            }
        }
        return result;
    }
}
