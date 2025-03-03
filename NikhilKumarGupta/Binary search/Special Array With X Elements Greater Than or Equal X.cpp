class Solution {
    public:
    int count(vector<int>&nums,int mid){
        
        int n=nums.size();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=mid){
                cnt++;
            }
        }
        return cnt;
    }
        int specialArray(vector<int>& nums) {
            
            int n=nums.size();
            int low=0;
            int high=n;
            while(low<=high){
                int mid=(low+high)/2;
                if(count(nums,mid)==mid){
                    return mid;
                   
                }
                else if( count(nums,mid)>mid ){
                     low=mid+1;
                }
                else {
                    high=mid-1;
                }
                
    
            }
            return -1;
    
    
            
        }
    };