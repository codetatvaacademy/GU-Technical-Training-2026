class Solution {
    public:
        int maxi(vector<int >&nums){
            int n=nums.size();
            int maxix=INT_MIN;
            for(int i=0;i<n;i++){
                maxix=max(maxix,nums[i]);
            }
            return maxix;
        }
        int solve(vector<int>&nums,int mid){
            int n=nums.size();
            int total=0;
            for(int i=0;i<n;i++){
                total+=(nums[i]+mid-1)/mid;
            }
            return total;
        }
        int smallestDivisor(vector<int>& nums, int threshold) {
            int low=1;
            int high=maxi(nums);
            int ans=0;
    
            while(low<=high){
                int mid=(low+high)/2;
               
                if(solve(nums,mid)<=threshold){
                    ans=mid;
                  high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return ans;
    
    
            
        }
    };