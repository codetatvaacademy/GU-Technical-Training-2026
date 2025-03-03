import java.util.Scanner;

public class IremoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
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
        System.out.println("Enter the value to remove: ");
        int val = sc.nextInt();
        int res = removeElement(nums, val);
        System.out.println(res);
        System.out.println("Array after removing the element: ");
        for (int i = 0; i < res; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
