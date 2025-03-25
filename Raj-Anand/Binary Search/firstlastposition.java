class firstlastposition {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int last=-1;
        int first=-1;
        int mid;
        //starting index:
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                first=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{

                 end=mid-1;
            }
            
        }
        //no element present
        if(first==-1){
            return new int[]{-1,-1};
        }
        //end index
        start=0;
        end=nums.length-1;

        while(start<=end){
             mid=start+(end-start)/2;
            if(nums[mid]==target){
                last=mid;
                 start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return new int[]{first,last};

        
    }
}
