import java.util.*;

public class Problem5 {
    public static double findMaxAverage(int[] nums, int k) {
        double  maxSum = 0;
        int end=0;
        int start=0;
        double sum=0;
        while(end<nums.length){
            sum+=nums[end];
            if((end-start+1)==k){
                maxSum=Math.max(maxSum,sum);
                sum-=nums[start];
                start++;
            }
            end++;
        }
        return maxSum / k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(findMaxAverage(nums, k));
    }
}