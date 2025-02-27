class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for(int i = 0; i < nums.length; i=i+2){
            len += nums[i];
        }

        int result[] = new int[len];
        int k = 0;

        for(int i = 0; i < nums.length; i=i+2){
            for(int j = 0; j < nums[i]; j++){
                result[k++] = nums[i+1];
            }
        } 
        return result;
    }
}
