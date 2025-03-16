class Solution {
    public:
       
    
        long long summ(vector<int>&batteries){
            int n=batteries.size();
            long long  sum=0;
            for(int i=0;i<n;i++){
                sum+=batteries[i];
            }
            return sum;
        }
        long long solve(int n, vector<int>& batteries,long long mid){
             
            long long total=0;
            for(int i=0;i<batteries.size();i++){
            total+=min((long long)batteries[i],mid);
            }
            return total;
        }
        
    
        long long maxRunTime(int n, vector<int>& batteries) {
            long long low=0;
            long long high=summ(batteries)/n;
    
            while(low<=high){
                long long mid=(low+high)/2;
                if(solve(n,batteries,mid)>=(n*mid)){
                    low=mid+1;;
                }
                else{
                    high=mid-1;
                }
            }
            return high;
        }
    };