class Solution {
    public:
        int hIndex(vector<int>& arr) {
    
            sort(arr.begin(),arr.end());
    
            int count  = 0;
    
            int n = arr.size();
    
            int ans = 0;
    
            for(int i=n-1;i>=0;i--){
                if(arr[i]>0) count++;
                
                int elements = arr.size()-i;
                
                if(count == elements && arr[i] >=count) ans = count;
            }
    
            return ans;
            
        }
    };