import java.util.Arrays;

public class SmallestRange3 {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int bestL=nums[0]+k;
        int bestR= nums[nums.length-1]-k;
        int res= nums[nums.length-1]-nums[0];
        for(int i=0;i<nums.length -1;i++){
            int min= Math.min(bestL ,nums[i+1]-k);
            int max= Math.max(bestR, nums[i]+k);
            res= Math.min(res, max-min);
        }
        return res;
    }
}
