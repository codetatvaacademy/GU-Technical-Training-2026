class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int start = 0;
        int end = 0;
        int maxUnsatisfied = 0;
        int satisfied = 0;
        for (int i = 0; i < customers.length; i++) {
            satisfied+=(1-grumpy[i])*customers[i];
        }
        while (end < customers.length) {
            satisfied+=customers[end]*grumpy[end];
            if (end - start >= minutes) {
                if (grumpy[start] == 1) {
                    satisfied -= customers[start];
                }
                start++;
            }
            maxUnsatisfied = Math.max(maxUnsatisfied, satisfied);
            end++;
        }
        return maxUnsatisfied;
    }
}