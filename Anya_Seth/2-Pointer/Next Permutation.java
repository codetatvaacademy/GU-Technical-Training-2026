class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        int j = nums.length - 1;
        for (i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[j]) {
                break;
            } else {
                j--;
            }
        }
        if(i >= 0){
        int swap=0;
        for (int k = i + 1; k < nums.length; k++) {
            if (nums[i] < nums[k]) {
                swap=k;
            }
        }
        int temp = nums[i];
        nums[i] = nums[swap];
        nums[swap] = temp;
        }
        int l = nums.length - 1;
        for (int m = i + 1; m < nums.length; m++) {
            if (m < l) {
                int temp = nums[m];
                nums[m] = nums[l];
                nums[l] = temp;
            }
            l--;
        }
    }
}
