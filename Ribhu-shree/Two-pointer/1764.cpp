class Solution {
    public:
        bool canChoose(vector<vector<int>>& groups, vector<int>& nums) {
            int i = 0,j=0;
            bool answer=false;
            while(i<groups.size() && j<nums.size()){
                int k =0;
                while(j+k <nums.size() && k<groups[i].size() && groups[i][k]==nums[j+k]){
                   k++; 
                }
                if(k == groups[i].size()){
                    i++;
                    j+=k;
                }else{
                    j++;
                }
    
            }
            
            if(i == groups.size()){
                answer = true;
            }
            return answer;
        }
    };