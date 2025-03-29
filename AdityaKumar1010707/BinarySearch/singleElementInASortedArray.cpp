class Solution {
    public:
        int singleNonDuplicate(vector<int>& nums) {
    
            int start =0;
            int end = nums.size()-1;
    
            if(nums.size()==1) return nums[0];
    
            while(start<=end){
                
                int mid = start + (end-start)/2;
                int isEvenIndex = mid%2==0?true:false;
    
                //If mid is first element
                if(mid==0){
                    if(nums[mid]!=nums[mid+1]) return nums[mid];
                    else start = mid+1;
                }
                //If mid is last element
                else if(mid==nums.size()-1){
                    if(nums[mid]!=nums[mid-1]) return nums[mid];
                    else end =  mid-1;
                    
                }
                //If mid is in between
                else{
    
                    if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                        return nums[mid];
                    }
                    else if(isEvenIndex && nums[mid+1]==nums[mid]){
                        start = mid+1;
                    }
                     else if(!isEvenIndex && nums[mid-1]==nums[mid]){
                        start = mid+1;
                    }
                    else{
                        end=mid-1;
                    }
    
                }
            }
    
            return start;
            
        }
    };