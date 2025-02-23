public class SubArraysSizeKavg {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0;
        int sum = 0;
        int cnt = 0;
        for (int end = 0; end < k; end++) {
            sum += arr[end];
        }
        if ((sum / k) >= threshold) {
            cnt++;
        }
        for (int end = k; end < arr.length; end++) {
            sum = sum - arr[start] + arr[end];
            start++;
            if ((sum / k) >= threshold) {
                cnt++;
            }

        }
        return cnt;
    }
}
