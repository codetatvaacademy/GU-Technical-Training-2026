class Solution {
    public:
        int minOperations(vector<int>& nums, int x) {
            int totalsum = 0;
            for(int i =0 ;i<nums.size();i++){
                totalsum+=nums[i];
            }
            int k = totalsum - x; 
            int left=0,right=0;
            int length =-1;
            int sum = 0;
            
            while(right <nums.size()){
                sum += nums[right];
    
                while(left <= right && sum>k){
                    sum -=nums[left];
                    left++;
                }
                if(sum == k ){
                    length= max(length,right-left +1);
                }
    
                
                right++;
            }
            if(length == -1) return -1;
    
            return nums.size() - length;
        }
    };