class Solution {
    private int[] prefixSum;
    private int totalWeight;
    private Random rand;

    public Solution(int[] w) {
        int n = w.length;
        prefixSum = new int[n];
        totalWeight = 0;
        for (int i = 0; i < n; i++) {
            totalWeight += w[i];
            prefixSum[i] = totalWeight;
        }
        rand = new Random();
    }

    public int pickIndex() {
        int target = rand.nextInt(totalWeight) + 1;

        int low = 0, high = prefixSum.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (prefixSum[mid] >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */