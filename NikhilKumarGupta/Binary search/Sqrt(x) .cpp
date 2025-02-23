class Solution {
    public:
        int mySqrt(int x) {
            int s=0;
            int e=x;
            int ans=-1;
            
            while(s<=e){
                long long mid =(s+e)/2;
                if(mid*mid==x){
                    return mid ;
    
                }
                else if(mid*mid<x){
                    s=mid+1;
                    ans=mid;
                }
                else{
                    e=mid-1;
                }
            }
            return ans;
        }
    };