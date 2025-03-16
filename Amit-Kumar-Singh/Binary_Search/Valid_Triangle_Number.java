class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            int k = i+2;
            for(int j= i+1; j<n-1 && nums[i]!=0 ;j++){
                k = binarySearch(nums,k,n-1,nums[i]+nums[j]);
                count += k-j-1;
            }
        }
        return count;
    }
    private int binarySearch(int nums[],int start, int end, int x){
        while(end>=start && end<nums.length){
            int mid = (start+end)/2;
            if(nums[mid]>=x){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}
