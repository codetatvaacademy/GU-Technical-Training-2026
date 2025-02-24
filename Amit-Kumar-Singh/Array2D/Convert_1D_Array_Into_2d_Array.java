//Time Complexity: O(n)
//Space Complexity: O(n)
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length){
            return new int[0][0];
        }
        int[][] result = new int[m][n];
        int originalIdx = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j] = original[originalIdx];
                originalIdx++;
            }
        }
        return result;
    }
}