import java.util.Scanner;

public class MaximumValueStepByStepSum {
        public int minStartValue(int[] nums) {
            int minSum =0;
            int preSum =0;
            for(int i=0;i<nums.length;i++){
                preSum+=nums[i];
                minSum = Math.min(minSum,preSum);
            }
            return 1-minSum;
        }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        MaximumValueStepByStepSum ms = new MaximumValueStepByStepSum();
        System.out.println(ms.minStartValue(nums));
    }
}
