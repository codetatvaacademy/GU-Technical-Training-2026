//Time Compelxity: O(logn)
//Space Complexity: O(1)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int mid = binarySearchNormal(nums,target);
        int targetStartIdx = -1;
        int targetEndIdx = nums.length;

        if(mid==-1){
            return new int[]{-1,-1};
        }
        targetStartIdx = binarySearchLeft(nums,0,mid-1,target);
        targetEndIdx = binarySearchRight(nums,mid+1,nums.length-1,target);
        return new int[]{targetStartIdx,targetEndIdx-1};
    }
    public static int binarySearchNormal(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static int binarySearchLeft(int[] nums, int start, int end, int target){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    public static int binarySearchRight(int[] nums,int start,int end,int target){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return end+1;
    }
}