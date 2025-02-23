import java.util.Arrays;
import java.util.Scanner;

public class SmallestRangeII{
    public static int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int rest = nums[n-1] - nums[0];
        int bestL = nums[0] + k;
        int bestR = nums[n-1] - k;
        for(int i = 0; i < n-1; i++){
            int min = Math.min(bestL, nums[i+1]-k);
            int max = Math.max(bestR, nums[i]+k);
            rest = Math.min(rest, max - min);
        }
        return rest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        System.out.println("The minimum score is:" + smallestRangeII(nums, k));
    }
}