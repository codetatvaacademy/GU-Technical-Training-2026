class Solution {
    public:
        int minSubArrayLen(int target, vector<int>& nums) {
            int start=0;
            int ml=INT_MAX;
            int sum=0;
            if(target)
    
            for(int end=0;end<nums.size();end++){
               
                sum+=nums[end];
                 
    
                while(sum>=target){
                    
                    ml=min(ml,end-start+1);
                    sum-=nums[start];
                    start++;
                    
                }
               
                
            }
            return (ml==INT_MAX)?0:ml;
           
            
        }
    };