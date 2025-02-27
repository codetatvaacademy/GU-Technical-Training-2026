import java.util.Scanner;;
public class MinimumOperation {
        public int minOperations(int[] nums, int x) {
            int start =0;
            int end =0;
            int targetSum =0;
            int totalSum =0;
            int n = nums.length;
            int maxLength=-1;
            for(int i=0;i<n;i++){
             totalSum += nums[i];
            }
            targetSum = totalSum - x;
             if(targetSum<0) return -1;
            int currentSum=0;
            while(end<nums.length){
                currentSum += nums[end];
                while(currentSum > targetSum){
                    currentSum -= nums[start];
                    start++;
                }
                 if(currentSum == targetSum){
                    maxLength = Math.max(maxLength,end-start+1);
                 }
                end++;
            } 
            if(maxLength ==-1) return -1;
            return n-maxLength;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int nums[] = new int[n];
            for(int i=0;i<nums.length;i++){
                nums[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            MinimumOperation mo = new MinimumOperation();
            System.out.println(mo.minOperations(nums, x));
        }
}
