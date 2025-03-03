class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int left = 0;
            int right = grid[0].length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (grid[i][mid] >= 0) {
                    left = mid + 1;
                } else if (grid[i][mid] < 0) {
                    right = mid - 1;
                }
            }
            count += grid[0].length - left;
        }
        return count;
    }
}