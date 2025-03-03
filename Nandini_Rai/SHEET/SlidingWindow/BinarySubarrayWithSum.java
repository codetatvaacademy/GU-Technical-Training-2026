import java.util.Scanner;
public class BinarySubarrayWithSum {
        public int binarySum(int nums[],int sum){
            int start =0;
            int count=0;
            int currentSum=0;
            for(int end =0;end<nums.length;end++){
                currentSum +=nums[end];
                while(currentSum>sum && start<=end){
                    currentSum -= nums[start];
                    start++;
                }
                if(currentSum == sum){
                    count++;
                }
            }
            return count;
        }
        public int numSubarraysWithSum(int[] nums, int goal) {
           if (goal == 0) {
                return binarySum(nums, 0);
            }
              return binarySum(nums, goal) - binarySum(nums, goal - 1);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int nums[] = new int[n];
            for(int i=0;i<nums.length;i++){
                nums[i] = sc.nextInt();
            }
            int goal = sc.nextInt();
            BinarySubarrayWithSum bs = new BinarySubarrayWithSum();
            System.out.println(bs.numSubarraysWithSum(nums, goal));
        }
}
