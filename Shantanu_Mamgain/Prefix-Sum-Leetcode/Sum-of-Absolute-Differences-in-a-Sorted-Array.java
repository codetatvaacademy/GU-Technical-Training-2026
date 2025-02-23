class Solution {
    public int findResult(int[] nums, int[] prefix, int i){        
    
        return Math.abs(Math.abs((nums[i]*i) - prefix[i-1]) +Math.abs (nums[i]*(nums.length-1-i) - (prefix[nums.length-1]-prefix[i])));
    }
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int [] result = new int[nums.length];
        int [] prefix = new int[nums.length];

        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = nums[i] + prefix[i-1];
        }

        for(int i = 0; i < nums.length; i++){
            if(i == 0 || i == nums.length-1){
                result[i] = Math.abs((prefix[nums.length-1])-(nums[i] * nums.length));
            }
            else{
                result[i] = findResult(nums,prefix,i);
            }
        }
        return result;

    }
}
