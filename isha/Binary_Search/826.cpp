class Solution {
    private: int binarySearch(vector<vector<int>> arr, int target ){
        int start=1;
        int end =arr.size()-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target>=arr[mid][0]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
public:
    int maxProfitAssignment(vector<int>& difficulty, vector<int>& profit, vector<int>& worker) {
        int maxProfit = 0;
        vector<vector<int>> arr(profit.size(), vector<int>(2));
        for(int i=0;i<profit.size();i++){
            arr[i][0]=difficulty[i];
            arr[i][1]=profit[i];
        }
        sort(arr.begin(), arr.end(), [](const vector<int>& a, const vector<int>& b) {
            return a[0] < b[0];
        });
        for(int i=1;i<worker.size();i++){
            arr[i][1]=max(arr[i][1],arr[i-1][1]);
        }
        for(int i=0;i<worker.size();i++){
            int index=binarySearch(arr,worker[i]);
            maxProfit+=(index== -1 ? 0 :arr[index][1]);
        }
        return maxProfit;



        
    }
};