class Solution {
    public boolean isValid(int[] weights, int capacity, int days) {
        days--;
        int weightSum = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > capacity) {
                return false;
            } else if (weights[i] + weightSum > capacity) {
                days--;
                weightSum = 0;
            }
            weightSum += weights[i];
        }
        return days >= 0;
    }

    public int shipWithinDays(int[] weights, int days) {
        int min = 1;
        int max = 0;
        for (int weight : weights) {
            max += weight;
        }
        while (min <= max) {
            int mid = (min + max) / 2;
            if (isValid(weights, mid, days)) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }
}