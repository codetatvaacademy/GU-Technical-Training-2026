import java.util.Scanner;

public class WrotateArray {
    public static void reverseArray(int[] nums,int si, int ei){
        while(si<=ei){
            int temp =nums[si];
            nums[si]=nums[ei];
            nums[ei]=temp;
            si++;
            ei--;
        }
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverseArray(nums, nums.length - k, nums.length - 1);
        reverseArray(nums, 0, nums.length - k - 1);
        reverseArray(nums, 0, nums.length - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        rotate(nums, k);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        
    }
}
