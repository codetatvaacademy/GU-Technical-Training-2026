class Solution {
    public:
        vector<int> productExceptSelf(vector<int>& nums) {
            int n=nums.size();
            vector<int> leftP(n);
            vector<int> rightP(n);
            vector<int> Product(n);
            leftP[0]=1;
            for(int i=1;i<n;i++){
                
                leftP[i]=leftP[i-1]*nums[i-1];
            }
            for(int i=n-2;i>=0;i--){
                rightP[n-1]=1;
                rightP[i]=rightP[i+1]*nums[i+1];
            }
            for(int i=0;i<n;i++){
                Product[i]=leftP[i]*rightP[i];
            }
           return Product; 
        }
    };