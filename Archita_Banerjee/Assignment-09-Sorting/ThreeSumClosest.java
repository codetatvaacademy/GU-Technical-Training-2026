import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n= nums.length;

        int sum=0;
        int minD= Integer.MAX_VALUE;
        int currD= 0;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                currD= target-sum;
                if(Math.abs(currD)<Math.abs(minD)){
                    minD=currD;
                }
                if(currD==0){
                    return target;
                }else if(sum<target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return target-minD;
    }
}
