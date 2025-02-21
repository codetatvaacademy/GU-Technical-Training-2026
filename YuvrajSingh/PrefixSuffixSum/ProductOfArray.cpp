class Solution {
    public:
        vector<int>Product(vector<int>& nums){
            int n = nums.size();
            vector<int> prefix(n);
            prefix[0] =1;
            vector<int> suffix(n);
            suffix[n-1] = 1; 
            vector<int> answer(n);
            for(int i =1;i<n;i++){
                prefix[i] = prefix[i-1] * nums[i-1];
            }
            for(int i =n-2;i>=0;i--){
                suffix[i] =suffix[i+1] * nums[i+1];
            }
            for(int i=0;i<n;i++){
                answer[i]=prefix[i] * suffix[i];
            }
            return answer;
        }
        vector<int> productExceptSelf(vector<int>& nums) {
            return Product(nums);
        }
    };