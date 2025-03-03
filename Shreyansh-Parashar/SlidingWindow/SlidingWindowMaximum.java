import java.util.*;
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] result = new int[n - k + 1];
        leftSum[0] = nums[0];

        for(int i = 1; i < n; i++){
            if(i % k == 0){
                leftSum[i] = nums[i];
            }else{
                leftSum[i] = Math.max(nums[i],leftSum[i - 1]);
            }
        }
        rightSum[n - 1] = nums[n - 1];
        for(int i = n - 2; i >= 0; i--){
            if(i % k == 0){
                rightSum[i] = nums[i];
            }else{
                rightSum[i] = Math.max(nums[i],rightSum[i + 1]);
            }
        }
        for (int i = 0; i <= n - k; i++) {
            result[i] = Math.max(rightSum[i], leftSum[i + k - 1]);
        }

        return result;
    }
    public static void main(String[] args) {
        SlidingWindowMaximum obj = new SlidingWindowMaximum();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the nums 'Arrays': ");
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the K: ");
        int k = sc.nextInt();

        int[] result = obj.maxSlidingWindow(nums, k);

        System.out.println(Arrays.toString(result));
    }
}
