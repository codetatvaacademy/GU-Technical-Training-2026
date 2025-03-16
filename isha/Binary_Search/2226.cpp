class Solution {
    private: bool isPossible(vector<int> & candies, long long k,int mid){
        if (mid == 0) return false; 
        long long total=0;
        for(int i=0;i<candies.size();i++){
            total+=candies[i]/mid;
            if(total>=k){
                return true;
            }
        }
        return false;
    }
public:
    int maximumCandies(vector<int>& candies, long long k) {
        int start=1;
        int result=0;
        int end=*max_element(candies.begin(),candies.end());
      while(start<=end){
        int mid=(start+end)/2;
        if(isPossible(candies,k,mid)){
            result=mid;
            start=mid+1;

        }else{
            end=mid-1;
        }

      } 
      return result; 
    }
};