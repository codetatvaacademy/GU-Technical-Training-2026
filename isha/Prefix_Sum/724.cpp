class Solution {
    public:
        int pivotIndex(vector<int>& nums) {
            int n=nums.size();
            vector<int> pivotLeft(n,0);
            vector<int> pivotRight(n,0);
            pivotRight[n-1]=nums[n-1];
            pivotLeft[0]=nums[0];
            for(int i=n-2;i>=0;i--){
                pivotRight[i]=pivotRight[i+1]+nums[i];
            }
            for(int i=1;i<n;i++){
                pivotLeft[i]=pivotLeft[i-1]+nums[i];
            }
            for(int i=0;i<n;i++){
                if(pivotLeft[i]==pivotRight[i]){
                    return i;
                }
            }
         return -1 ;
        }
    };