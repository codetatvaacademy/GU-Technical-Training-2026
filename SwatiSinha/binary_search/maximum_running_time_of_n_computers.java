class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long min = Integer.MAX_VALUE;
        long max = 0; long sum=0;
        for (int battery : batteries) {
            min = Math.min(battery, min);
            max += battery;
        }
        max/=n;
        while (min <= max) {
            long mid = (min + max) / 2;
            long totalTime = 0;
            for (int battery : batteries) {
                totalTime += Math.min(battery, mid);
            }
            if (totalTime >= mid * n) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return max;
    }
}