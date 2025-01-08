public class problem_1 {
    public static int weight(int nums[]) {
        int n = nums.length;
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        for (int j = i + 1; j < n; j++) {
                sum2 += nums[j];
                if (sum == sum2) {
                    return 1;
                } else {
                  return -1;
                }
            }
        }
         return 0;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, -1, 8, 4 };
        System.out.println(weight(nums));

    }
}
