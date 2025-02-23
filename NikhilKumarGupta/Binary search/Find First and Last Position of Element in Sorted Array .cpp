class Solution {
    public:
    int first(vector<int>& nums, int target){
           int n=nums.size();
    
            int in1=-1;
            int s=0;
            int e=n-1;
           
           
            while(s<=e){
                int mid=(s+e)/2;
    
                if(target==nums[mid]){
                   in1=mid;
          e= mid - 1;
    
                    }
                else if(target>nums[mid]){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
                
            }
            return in1;
    
    }
    int last(vector<int>& nums, int target){
           int n=nums.size();
    
            int in2=-1;
            int s=0;
            int e=n-1;
           
           
            while(s<=e){
                int mid=(s+e)/2;
    
                if(target==nums[mid]){
                   in2=mid;
          s= mid + 1;
    
                    }
                else if(target>nums[mid]){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
                
            }
            return in2;
    
    }
        vector<int> searchRange(vector<int>& nums, int target) {
          int in1=first( nums, target);
          if(in1==-1){
            return {-1,-1};
    
          }
           int in2=last( nums, target);
           return {in1,in2};
    
           
        
        }
    };