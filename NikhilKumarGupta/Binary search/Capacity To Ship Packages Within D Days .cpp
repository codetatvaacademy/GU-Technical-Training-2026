class Solution {
    public:
    
            int maxwe(vector<int>& w){
                int maxi=INT_MIN;
                for(int i=0;i<w.size();i++){
                    maxi=max(maxi,w[i]);
    
                }
                return maxi;
            }
    
             int summ(vector<int>& w){
                int sum=0;
                for(int i=0;i<w.size();i++){
                    sum+=w[i];
                }
                return sum;
             }
    
             int findays(vector<int>& weights,int cap){
                int n=weights.size();
                int load=0;
                int day=1;
                for(int i=0;i<n;i++){
    
                    if((load+weights[i])>cap){
                        day++;
                        load=weights[i];
                    }
                    else{
                        load=load+weights[i];
                    }
    
                }
                return day;
             }
    
    
    
        int shipWithinDays(vector<int>& weights, int days) {
            int low=maxwe(weights);
            int high=summ(weights);
            while(low<=high){
                int mid=(low+high)/2;
                int val=findays(weights,mid);
                if(val<=days){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
    
    
    
            }
            return low;
        }
    };