class Solution {
    private: bool isPossible(vector<int>& piles,int mid,int h){
        long long time=0;
        for(int i=0;i<piles.size();i++){
            time+=(long long)((piles[i]+mid-1)/mid);
        }
        return h>=time;
    }
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int start=1;
        int end=*max_element(piles.begin(),piles.end());
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(isPossible(piles,mid,h)){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
        
    }
};