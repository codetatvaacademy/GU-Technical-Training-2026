class Solution {
    public int minStartValue(int[] nums) {
        int currsum =0;
        int minTotalSum = 0;
        for(int num:nums){
            currsum +=num;
            minTotalSum = Math.min(currsum,minTotalSum);
        }
        return  1 - minTotalSum;
    }
}