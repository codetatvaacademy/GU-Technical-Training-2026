package Binarysearch;


class findminsotedarray {
    public int findMin(int[] nums) {
        
       int min=0;
     int max= nums.length-1;
    
     while(min<max){
        int mid = (min+max)/2;
        if(nums[mid]<nums[max]){ 
          
            max= mid;
        } 
        else if(nums[mid]>nums[max]) {
            min = mid+1;
        }
        
     }
     return nums[max];
}
} 