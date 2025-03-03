class Solution {
    public int minimumSize(int[] nums, int maxOperations){
        int min = 1;
        int max = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        while(min < max){
            int mid =  (min + max)/2;
            if(isPossible(mid,nums,maxOperations)){
                max = mid;
            }
            else{
                min = mid + 1;
            }
        }
        return min;
    }
    private boolean isPossible(int maxBallsInBag, int[] nums, int maxOperations){
        int totalOperations = 0;
        for(int num : nums){
            int operations = (int)Math.ceil(num/(double)maxBallsInBag) - 1;
            totalOperations += operations;
            if(totalOperations > maxOperations){
                return false;
            }
        }
        return true;
        }
    }
