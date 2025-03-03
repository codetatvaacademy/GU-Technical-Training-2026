import java.util.Scanner;

public class MinimumSizeSubaaraySum {
        public int minSubArrayLen(int target, int[] nums) {
            int start = 0;
            int end = 0;
            boolean val=false;
            int sum=0;
            int minLength = nums.length;
            while(end < nums.length){
                sum+=nums[end]; 
                while(sum>=target && start<nums.length){
                    sum-= nums[start];
                    minLength = Math.min(minLength , end - start + 1);
                   start++;
                   val =true;
                }
                
                end++;
            }
            if(val==true)
            return minLength;
            else
            return 0;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int target = sc.nextInt();
            int n = sc.nextInt();
            int nums[] = new int[n];
            for(int i=0;i<nums.length;i++){
                nums[i] = sc.nextInt();
            }
          MinimumSizeSubaaraySum ms = new MinimumSizeSubaaraySum();
          System.out.println(ms.minSubArrayLen(target, nums));
        }
}
