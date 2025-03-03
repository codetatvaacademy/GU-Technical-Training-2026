class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        int decompressedListSize = 0;
        for(int i=0;i<n;i+=2){
            decompressedListSize +=nums[i];
        }
        int[] decompressedList = new int[decompressedListSize];
        int idx = 0;
        for(int i=0;i<n;i+=2){
            for(int j=0;j<nums[i];j++){
                decompressedList[idx+j] = nums[i+1];
            }
            idx += nums[i];
        }
        return decompressedList;
    }
}
