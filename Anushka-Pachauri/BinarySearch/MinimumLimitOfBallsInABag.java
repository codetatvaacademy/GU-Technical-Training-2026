class MinimumLimitOfBallsInABag {
    public boolean isValid(int[] nums,int mid,int maxOperations){
        for(int num:nums){
            maxOperations-=(num-1)/mid;
        }
        return maxOperations>=0;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int min=1;
        int max=0;
        for(int num : nums){
            if(num>max){
                max=num;
            }
        }
        while(min<=max){
            int mid=(max+min)/2;
            if(isValid(nums,mid,maxOperations)){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return min;
    }
}