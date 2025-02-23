class Solution {
    public int minStartValue(int[] nums) {
        int startValue = 0;
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            startValue = Math.min(startValue,sum);
        }
        if(startValue<0){
            return Math.abs(startValue) + 1;
        }
        else{
            return 1;
        }
    }
}
