class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int sum = nums[i] + nums[j];
                int start = j + 1;
                int end = n - 1;

                
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (nums[mid] < sum) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }

                
                count += end - j;
            }
        }

        return count;
    }
}