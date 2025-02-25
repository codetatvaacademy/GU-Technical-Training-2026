import java.util.Arrays;

public class MaxSumPermutation {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        Arrays.sort(nums);
        long []prefix =new long[nums.length];
        for(int i=0;i<requests.length;i++){

            prefix[requests[i][0]]++;
            if(requests[i][1]<nums.length-1){
                prefix[requests[i][1]+1]--;
            }
        }
        for(int i=1;i<nums.length;i++){
            prefix[i]= prefix[i]+prefix[i-1];
        }
        Arrays.sort(prefix);
        long sum=0;
        for(int i=nums.length-1;i>=0;i--){
            sum += nums[i]*prefix[i];
        }
        return (int)(sum%(Math.pow(10,9)+7));
    }
}
