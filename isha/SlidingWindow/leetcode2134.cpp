class Solution {
    public:
        int minSwaps(vector<int>& nums) {
              int n = nums.size();
            
           
            int totalOnes = 0;
            for (int num : nums) {
                if (num == 1) {
                    totalOnes++;
                }
            }
    
           
            if (totalOnes == 0) return 0;
    
            
            int start = 0, end = 0, currentZeros = 0, answer = INT_MAX;
            
            
            for (end = 0; end < totalOnes; end++) {
                if (nums[end] == 0) {
                    currentZeros++;
                }
            }
            
            
            answer = currentZeros;
    
            
            while (start < n) {
                
                if (nums[start] == 0) {
                    currentZeros--;
                }
                
               
                end = (start + totalOnes) % n;
                
                
                if (nums[end] == 0) {
                    currentZeros++;
                }
                
                
                answer = min(answer, currentZeros);
                
               
                start++;
            }
            
            return answer;
            
        }
    };