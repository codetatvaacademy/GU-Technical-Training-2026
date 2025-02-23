import java.util.Scanner;
class BuildArrayPermutation {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array (each value should be between 0 and " + (n-1) + "):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] result = buildArray(nums);
        System.out.println("The resulting array is:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
