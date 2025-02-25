import java.util.Scanner;

public class Gmaxconsecutiveones {
    public static int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int count = 0;
        int mincount = 0;
        while (end < nums.length) {
            if (nums[end] == 1) {
                count++;
            }
            if (nums[end] == 0 && k > 0) {

                count++;
                k--;
            }
            if (k >= 0) {
                mincount = Math.max(mincount, count);
            }
            while (k <= 0 && start < nums.length) {
                if (nums[start] == 0) {
                    k++;
                }
                start++;
                count--;
            }
            end++;
        }
        return mincount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(longestOnes(nums, k));
    }
}
