
public class rangesumquery {
    int[] sum;
    public void NumArray(int[] nums) {
        this.sum = nums;
        if(nums.length>0)sum[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            sum[i]=sum[i-1]+nums[i];
        }
    }

    public int sumRange(int i, int j) { 
        if(i==0)return sum[j];
        return sum[j]-sum[i-1];
    }
} 

