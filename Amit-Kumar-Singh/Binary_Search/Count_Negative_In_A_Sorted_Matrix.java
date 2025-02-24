//Time Complexity: O(logn)
//Space Compelxity: O(1)
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        int lastNeg = n-1;
        for(int i=0;i<m;i++){
            if(grid[i][0]<0){
                count +=n;
                continue;
            }
            if(grid[i][n-1]>0){
                continue;
            }
            int start = 0;
            int end = lastNeg;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(grid[i][mid]<0){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            count += (n-start);
            lastNeg = start;
        }
        return count;
    }
}