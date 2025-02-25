import java.util.Arrays;

public class ThirdMaxNum {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                cnt++;
            }
            if (cnt == 3) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
