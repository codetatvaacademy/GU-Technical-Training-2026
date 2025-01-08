
import java.util.Scanner;

class FindPivotIndex {
    public static int calculation(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = nums[0];
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + nums[i];
        }
         right[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i];
        }
        for (int i = 0; i < n; i++) {
            if (left[i] == right[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of villagers: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the weight of villager " + (i + 1) + " : ");
            nums[i] = sc.nextInt();
        }
        int middle = calculation(nums);
        if (middle >= 0) {
            System.out.println("See-saw balances at index: " + middle);
        } else {
            System.out.println("See-saw cannot be balanced");
        }
        sc.close();
    }
}
// time complexiy 0(n) //
// space complexity 0(1) //