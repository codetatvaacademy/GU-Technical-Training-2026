class Solution {
    private: int countA(vector<int>& nums,int mid){
        int count=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]>=mid){
                count++;
            }
        }
        return count;
    }
public:
    int specialArray(vector<int>& nums) {
        int start=0;
        int end=nums.size();
        while(start<=end){
            int mid=(start+end)/2;
            int ans=countA(nums,mid);
            if(ans==mid){
                return mid;
            }
            if(mid>ans){
                end=mid-1;
            }else{
                start=mid+1;
            }
          
        }
        return -1;
    }
};