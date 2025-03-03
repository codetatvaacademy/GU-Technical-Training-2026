class Solution {
    private: 
        bool isPossible(vector<int>& ranks,int cars,long long time){//t=r*n*n given
            long long total_cars=0;
            for(int i=0;i<ranks.size();i++){
                total_cars+=sqrt(time/ranks[i]);
            }
           return total_cars>=cars;
        }
public:
    long long repairCars(vector<int>& ranks, int cars) {
        int start=1;
        long long end=*min_element(ranks.begin(),ranks.end())*cars*cars;
        long long mid;
        while(start<=end){
            mid=(start+end)/2;
            if(isPossible(ranks,cars,mid)){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
};