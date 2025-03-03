class Solution {
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            if(sum < min){
                min = sum;
            }
        }
        min = min>=1?1:min*(-1)+1;
        return min;
    }
}