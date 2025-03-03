class Solution {
    private: bool isP(vector<int>& nums,int mid,int threshold){
        int sum=0;
        for(int i=0;i<nums.size();i++){
            sum+=((nums[i]+mid-1)/mid);
            
        }
        return sum<=threshold;
    }
public:
    int smallestDivisor(vector<int>& nums, int threshold) {
        int start=1;
        int end=*max_element(nums.begin(),nums.end());
        while(start<=end){
            int mid=(start+end)/2;
            if(isP(nums,mid,threshold)){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
};