import java.util.Scanner;

public class JremoveDuplicateFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
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
        int res = removeDuplicates(nums);
        System.out.println(res);
        System.out.println("Array after removing the duplicates: ");
        for (int i = 0; i < res; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
