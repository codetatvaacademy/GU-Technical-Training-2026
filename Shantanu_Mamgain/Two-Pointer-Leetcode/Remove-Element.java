class Solution {
    public void swap(int[] nums, int i, int j){
        int temp  = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int removeElement(int[] nums, int val) {
        int j = -1;
        int count =0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] == val){
                j = i;
                break;
            }
        }
        if(j == -1){
            return nums.length;
        }

        for(int i = j+1; i < nums.length; i++){
            if(nums[i] != val){
                swap(nums, i , j);
                j++;
            }
        }

        return j ;
    }

}
