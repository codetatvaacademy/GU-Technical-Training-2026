import java.util.Scanner;

class NextPermutation{
    private static void reverse(int[] nums, int start, int end) {
        while (start < end)
            swap(nums, start++, end--);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public  static void nextPermutation(int[] nums) {
        int i = nums.length-1;
        while (i > 0 && nums[i - 1] >= nums[i]) {
            i--;
        }
        if (i == 0) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int j = nums.length-1;
        while (nums[j] <= nums[i - 1]) {
            j--;
        }
        swap(nums, i - 1, j);
        reverse(nums, i, nums.length - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        nextPermutation(nums);
        System.out.println("The next permutaion will be:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

//time complexity of the function is : O(n)
//space complexity of the function is : O(1)

//time complexity of the function is : O(n) + O(n)
//space complexity of the function is : O(n)