import java.util.Arrays;
import java.util.Scanner;

public class MaximumProductOfThreeNumber {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[1]*nums[n-1]);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int nums[] = new int[n];
    for(int i=0;i<nums.length;i++){
        nums[i] = sc.nextInt();
    }
    MaximumProductOfThreeNumber mp = new MaximumProductOfThreeNumber();
    System.out.println(mp.maximumProduct(nums));
   }
}
