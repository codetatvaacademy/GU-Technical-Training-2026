class Solution {
    public:
        int maxi(vector<int>&bloomDay){
            int n=bloomDay.size();
            int maxix=INT_MIN;
            for(int i=0;i<n;i++){
                maxix=max(maxix,bloomDay[i]);
            }
            return maxix;
        }
    
        bool solve(vector<int>& bloomDay, int m, int k,int mid){
            int count=0;
            int n=bloomDay.size();
            int total=0;
            for(int i=0;i<n;i++){
                if(bloomDay[i]<=mid){
                    count++;
                }
                else{
                    total+=(count/k);
                    count=0;
                }
               
            }
             total+=(count/k);
            return total>=m;
        }
    
        int minDays(vector<int>& bloomDay, int m, int k) {
            int val=m*1ll*k*1ll;
            if(val>bloomDay.size())return -1;
            int low=1;
            int ans=0;
            int high=maxi(bloomDay);
            while(low<=high){
                int mid=(low+high)/2;
                if(solve(bloomDay,m,k,mid)){
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