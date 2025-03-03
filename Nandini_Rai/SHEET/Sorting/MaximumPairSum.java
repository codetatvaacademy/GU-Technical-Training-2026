import java.util.Arrays;
import java.util.Scanner;

public class MaximumPairSum {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j = nums.length-1;
        int maxSum =0;
        while(i<j){
         int sum = nums[i]+nums[j];
        maxSum = Math.max(maxSum,sum);
        i++;
        j--;
        }
        return maxSum;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int nums[] = new int[n];
    for(int i=0;i<nums.length;i++){
        nums[i] = sc.nextInt();
    }
  MaximumPairSum mp = new MaximumPairSum();
  System.out.println(mp.minPairSum(nums));
   }
}
