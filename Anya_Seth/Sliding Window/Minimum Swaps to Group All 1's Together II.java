class Solution {
    public int minSwaps(int[] nums) {
    int n  = nums.length;
    int ones = 0;
    for(int i = 0; i < nums.length ; i++){
        if(nums[i] == 1){
            ones++;
        }
    }
    int start = 0;
    int end = 0;
    int zeroes = 0;
    int minZeroes = Integer.MAX_VALUE;
    while(end < ones){
		if(nums[end] == 0){
			zeroes++;
		}
        end++;
	}
    while(end < 2 * n){
    int length = end - start + 1;
        if(nums[end % n] == 0){
		zeroes++;
		}
        if (length == ones) {
			zeroes = Math.min(minZeroes, zeroes);
		} 
        else if (length > ones) {
			if(nums[start % n ] == 0){
				zeroes--;
			}
            minZeroes = Math.min(minZeroes, zeroes);
				start++;
			}  
            end++;
    }
    return minZeroes;
    }
}
