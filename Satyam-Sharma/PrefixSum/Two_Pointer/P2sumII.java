import java.util.Scanner;

public class P2sumII {
    public static int[] twoSum(int[] nums, int target) {
        int start = 0;
        int[] ans = new int[2];
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] + nums[end] == target) {
                ans[0] = start + 1;
                ans[1] = end + 1;
                start++;
                end--;
            } else if (nums[start] + nums[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int[] res = twoSum(nums, target);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        
    }
}
