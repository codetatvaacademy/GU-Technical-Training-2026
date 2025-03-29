package Binarysearch;


class minimumlimitofbag { 

    public boolean isPossible(int [] nums,int mid,int maxOperations){
    
    int n = nums.length;
        for(int i=0;i<n;i++){
           if(nums[i] > mid){
             
             if(nums[i]%mid==0){
               int div = nums[i]/mid;
                 maxOperations=maxOperations-div+1;
             }
             else{
                int div = nums[i]/mid;
            maxOperations=maxOperations-div;
           }
           } 
         } 
         return maxOperations>=0;
    }  
        public int minimumSize(int[] nums, int maxOperations) {
         
         int min =1;
         int max=0;
         for( int num : nums){
            max= Math.max(max,num);
         } 
        
        while(min <= max){ 
           int mid= (min+max)/2;
          if(isPossible(nums,mid,maxOperations)){ 
            max=mid-1;
          } 
          else{
            min=mid+1;
          }
        }
         return min;
        }
    } 