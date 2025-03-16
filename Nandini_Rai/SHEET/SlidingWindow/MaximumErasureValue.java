import java.util.Scanner;

public class MaximumErasureValue {
        public int maximumUniqueSubarray(int[] nums) {
            int frequency[] = new int[100001];
            int start =0;
            int end =0;
            int sum =0;
            int maxScore =0;
            for(int i=0;i<nums.length;i++){
                sum += nums[end];
                frequency[nums[end]]++;
                while(frequency[nums[end]]>1){
                    frequency[nums[start]]--;
                    sum -= nums[start];
                    start++;
                }
                maxScore = Math.max(maxScore,sum);
                end++;
            }
            return maxScore;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        MaximumErasureValue me = new MaximumErasureValue();
        System.out.println(me.maximumUniqueSubarray(nums));
    }
}
