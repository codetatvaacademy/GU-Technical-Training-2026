class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[x++]=nums[i];
            }
        }
        for(int i=x;i<nums.length;i++){
            nums[i]=0;
        }
    }
}