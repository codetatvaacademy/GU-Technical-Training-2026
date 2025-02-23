class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        int min = 1;
        int max = x;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (mid * mid == x) {
                return mid;
            } else if (mid * mid < x) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }

        }
        return max;

    }
}