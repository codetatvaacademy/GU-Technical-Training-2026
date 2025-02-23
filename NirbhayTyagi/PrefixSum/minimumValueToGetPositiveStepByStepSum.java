import java.util.Scanner;

class minimumValueToGetPositiveStepByStepSum{
    public static int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        if (min < 1) {
            return -min + 1;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int length = sc.nextInt();
        int[] nums = new int[length];
        for(int i=0; i<length; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Minimum Positive Value: " + minStartValue(nums));
        
    }
}