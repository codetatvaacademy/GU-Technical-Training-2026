package TwoPointerTechnique;
import java.util.Scanner;

class RemoveDuplicatesfromSort{
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("The resultant array is " + removeDuplicates(nums));
    }
}

//Time complexity of the function is : O(n)
//Space complexity of the function is : O(1)

//Time complexity of the whole program is : O(n) + O(n)
//Space complexity of the whole program is : O(1) + O(n)
