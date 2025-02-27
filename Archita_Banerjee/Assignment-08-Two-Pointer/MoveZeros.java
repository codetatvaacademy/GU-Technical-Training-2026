public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int nonZeroIn=0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonZeroIn]=nums[i];
                nonZeroIn++;
            }
        }
        for(int i= nonZeroIn; i<nums.length;i++){
            nums[i]=0;
        }
    }
}
