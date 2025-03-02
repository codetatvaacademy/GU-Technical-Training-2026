import java.util.Arrays;
import java.util.Scanner;

class SortColors{
    public static void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in nums array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        sortColors(nums);
        System.out.println("The resultant array is :");
        for(int i = 0; i < n; i++){
            System.out.print(nums[i]);
        }
    }
}