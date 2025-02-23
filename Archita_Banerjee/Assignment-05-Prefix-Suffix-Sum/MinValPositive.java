public class MinValPositive {
    public int minStartValue(int[] nums) {
        int min=0;
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            min= Math.min(min,sum);

        }
        return 1-min;
    }
}
