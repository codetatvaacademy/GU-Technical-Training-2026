import java.util.Arrays;
import java.util.Scanner;

public class SortColors {
        public void swap(int nums[], int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    
    public void sortColors(int[] nums) {
            int low = 0;
            int mid = 0;
            int high = nums.length - 1;
            while (mid <= high) {
                if (nums[mid] == 0) {
                    swap(nums, low, mid);
                    low++;
                    mid++;
                } else if (nums[mid] == 1) {
                    mid++;
                } else {
                    swap(nums,mid, high);
                    high--;
                }
            }
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

       SortColors sr = new SortColors();
        sr.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
