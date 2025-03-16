class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int curr=0,start=0,end=n-1,temp=-1;
        while(curr<=end){
            if(nums[curr]==2){
                temp=nums[end];
                nums[end]=nums[curr];
                nums[curr]=temp;
                end--;
            }
            else if(nums[curr]==0){
                temp=nums[start];
                nums[start]=nums[curr];
                nums[curr]=temp;
                start++;
                curr++;
            }
            else if(nums[curr]==1){
                curr++;
            }
        }
    }
}