class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int start = 1;
        int end = 0;

        for(int num : nums){
            end = Math.max(end,num);
        }

        while(start < end){
            int mid = start + (end-start)/2;
            long  count = 0;

            for(int num : nums){
                count += (num-1) / mid;
            }
            if (count<=maxOperations){
                end = mid;
            }
            else {
                start = mid +1;
            }
        }return start;
    }
}