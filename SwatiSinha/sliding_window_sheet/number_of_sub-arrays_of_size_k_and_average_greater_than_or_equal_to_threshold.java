class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0;
        int end = 0;
        int n = k;
        int sum = 0;
        int count = 0;
        while (end < arr.length) {
            sum += arr[end];
            n--;
            if (n == 0) {
                if (sum / k >= threshold) {
                    count++;
                }
                sum -= arr[start];
                n++;
                start++;
            }
            end++;
        }
        return count;
    }
}