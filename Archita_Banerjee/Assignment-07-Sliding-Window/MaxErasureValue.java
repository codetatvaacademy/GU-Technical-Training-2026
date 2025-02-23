import java.util.HashSet;

public class MaxErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int start=0;
        int end=0;
        int max=0;
        int sum=0;
        while(end<nums.length){
            while(set.contains(nums[end])){
                sum-=nums[start];
                set.remove(nums[start]);
                start++;
            }
            sum+=nums[end];
            set.add(nums[end]);
            max= Math.max(max, sum);
            end++;
        }
        return max;
    }
}
