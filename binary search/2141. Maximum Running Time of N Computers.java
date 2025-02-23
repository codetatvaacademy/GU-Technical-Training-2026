class Solution {
    public long maxRunTime(int n, int[] b) {
        long min = Integer.MAX_VALUE;
        long max = 0;
        for (int i : b) {
            max += i;

        }
        for (int i = 0; i < b.length; i++) {
            if (min > b[i]) {
                min = b[i];
            }
        }
        max = max / n;
        while (min <= max) {
            long mid = min + (max - min) / 2;
            long totalTime = 0;
            for (int i : b) {
                totalTime += Math.min(i, mid);
            }
            if (totalTime >= mid * n) {
                min = mid + 1;

            } else {
                max = mid - 1;
            }

        }
        // System.out.println(max);
        // System.out.println(min);
        return max;

    }
}