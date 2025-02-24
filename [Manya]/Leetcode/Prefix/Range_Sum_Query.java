import java.util.Scanner;

class NumArray {
    private int[] prefixSums;

    public NumArray(int[] nums) {
        prefixSums = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            prefixSums[i+1] = prefixSums[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return prefixSums[right + 1] - prefixSums[left];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        NumArray obj = new NumArray(nums);
        
        System.out.print("Enter left index: ");
        int left = scanner.nextInt();
        System.out.print("Enter right index: ");
        int right = scanner.nextInt();
        
        int result = obj.sumRange(left, right);
        System.out.println("The sum of the range is: " + result);
        
        scanner.close();
    }
}
