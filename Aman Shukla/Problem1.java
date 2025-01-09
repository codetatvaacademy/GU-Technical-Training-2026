// Time Complexity = O(n)
// Space Complexity = O(1)
import java.util.Scanner;

public class seesawBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                System.out.println(i);
                found = true;
                break;
            }
            leftSum += nums[i];
        }
        if (!found) {
            System.out.println("-1");
        }
    }
