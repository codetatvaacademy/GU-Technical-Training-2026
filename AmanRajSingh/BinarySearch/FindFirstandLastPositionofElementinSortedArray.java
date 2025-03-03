class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start= 0, end = nums.length-1;
        int first = -1, last = -1;

       
        while(start<=end) {
            int mid = (end-start)/2 + start;
            
            if(nums[mid]<target)
                start = mid+1;
            else if (nums[mid]>target)
                end = mid-1;
            else {
                end = mid-1;
                first = mid;
            }
        }    
        start=0;
        end=nums.length-1;

        
        while(start<=end) {
            int mid = (end-start)/2 + start;

            if(nums[mid]<target)
                start = mid+1;
            else if(nums[mid]>target)
                end = mid-1;
            else {
                start = mid+1;
                last = mid;
            }
        }

        return new int[]{first,last};
    }
}
