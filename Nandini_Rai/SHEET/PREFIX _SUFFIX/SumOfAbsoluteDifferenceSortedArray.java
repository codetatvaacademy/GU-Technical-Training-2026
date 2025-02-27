import java.util.Scanner;

public class SumOfAbsoluteDifferenceSortedArray {
        public int[] getSumAbsoluteDifferences(int[] nums) {
            int n = nums.length;
            int[] ans = new int[n]; 
            int totalSum = 0;
            for (int num : nums) {
                totalSum += num;
            }
            int leftSum = 0;
            for (int i = 0; i < n; i++) {
                int rightSum = totalSum - leftSum - nums[i];
    
                ans[i] = (i * nums[i] - leftSum) + (rightSum - (n - i - 1) * nums[i]);
    
                leftSum += nums[i]; 
            }
    
            return ans;
        }
       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
       SumOfAbsoluteDifferenceSortedArray  sd = new SumOfAbsoluteDifferenceSortedArray();
        int result[] = sd.getSumAbsoluteDifferences(nums);
        for(int i=0;i<nums.length;i++){
           System.out.print(result[i]+" ");
        }
    }
}
