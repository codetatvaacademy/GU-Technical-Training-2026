import java.util.Scanner;

class MoveZeroes{
    public static void moveZeroes(int[] nums) {
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
        }        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        moveZeroes(nums);
        System.out.println("The resultant array is ");
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
    }
}