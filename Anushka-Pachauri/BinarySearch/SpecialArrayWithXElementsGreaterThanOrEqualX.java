class SpecialArrayWithXElementsGreaterThanOrEqualX {
    public int count(int[] nums,int target){
        int ans=0;
        for(int num : nums){
            if(num>=target){
                ans++;
            }
        }
        return ans;
    }
    public int specialArray(int[] nums) {
        int min=0;
        int max=nums.length;
        while(min<=max){
            int mid=(min+max)/2;
            int answer=count(nums,mid);
            if(answer==mid){
                return mid;
            }
            else if(answer>mid){
                min=mid+1;
            }
            else{
                max=mid-1;
            }
        }
        return -1;
    }
}