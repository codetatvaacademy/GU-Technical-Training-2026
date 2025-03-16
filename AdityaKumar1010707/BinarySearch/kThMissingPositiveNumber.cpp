class Solution {
    public:
        int findKthPositive(vector<int>& arr, int k) {
            int maxNum = INT_MIN;
            for(auto x:arr){
                if(x>maxNum) maxNum=x;
            }
    
            vector<bool> hash(maxNum+k+1,false);
    
            for(auto x:arr){
                hash[x]=true;
            }
    
            int count = 0;
            for(int i=1;i<hash.size();i++){
                if(hash[i]==false) count++;
                if(count==k) return i;
            }
    
            return -1;
            
        }
    };