class Solution {
    private: bool isPossible(vector<int> nums, int maxOperations,int mid ){
        for(int num: nums){
            maxOperations -= (num-1)/mid;
        }
         return maxOperations >= 0;
    }
    
public:
    int minimumSize(vector<int>& nums, int maxOperations) {
        int start = 1;
        int end = *max_element(nums.begin(),nums.end());
        while(start <= end){
            int mid = (start+end)/2;
            if(isPossible(nums,maxOperations,mid)){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return start;  
    }
};