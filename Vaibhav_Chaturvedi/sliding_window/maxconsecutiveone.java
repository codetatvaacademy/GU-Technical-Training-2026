package sliding_window;


    class maxconsecutiveone {
        public int longestOnes(int[] nums, int k) {
            int left = 0; 
            int right = 0; 
            int zerosCount = 0; 
            int maxLength = 0; 
    
            while (right < nums.length) {
              
                if (nums[right] == 0) {
                    zerosCount++;
                }
    
                while (zerosCount > k) {
                    if (nums[left] == 0) {
                        zerosCount--;
                    }
                    left++;
                }
    
    
               
                maxLength = Math.max(maxLength, right - left + 1);
    

                right++;
            }
    
            return maxLength;
        }
    } 