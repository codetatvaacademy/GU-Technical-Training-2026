class Solution {
    public int smallestDivisor(int[] b, int threshold) {
        int min = 1; // Minimum divisor can be 1
        int max = Integer.MIN_VALUE;

        // Find the maximum element in the array
        for (int i : b) {
            max = Math.max(max, i);
        }

        // Binary search
        while (min <= max) {
            int mid = (max + min) / 2;
            int f = 0;

            // Calculate the sum of divisions
            for (int i : b) {
                f += (i + mid - 1) / mid; // Round up division
            }

            // Adjust binary search range
            if (f > threshold) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return min; // Minimum divisor that satisfies the condition
    }

}
