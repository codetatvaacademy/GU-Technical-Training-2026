class Solution {
    public:
        vector<int> productExceptSelf(vector<int>& nums) {
            int n=nums.size();
            vector<int> answer(n,1);
            vector<int> prepro(n,1);
            vector <int> suffpro(n,1);
        
            for(int i =1;i<nums.size();i++){
                prepro[i]=nums[i-1]*prepro[i-1];
            }
            for(int i =nums.size()-2;i>=0;i--){
                suffpro[i]=nums[i+1]*suffpro[i+1];
            }
    
            for(int i =0;i<answer.size();i++){
                answer[i] = prepro[i]*suffpro[i];
            }
            return answer;
        }
    };