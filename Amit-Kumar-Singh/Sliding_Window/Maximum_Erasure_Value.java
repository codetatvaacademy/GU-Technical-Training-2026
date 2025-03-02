class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxSum = 0;
        int start = 0;
        for(int end = 0;end < nums.length;end++){
            sum += nums[end];
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);
            while(map.get(nums[end])>1){
                
                map.put(nums[start],map.get(nums[start])-1);
                if(map.get(nums[start])==0){
                    map.remove(nums[start]);
                }
                sum -= nums[start];
                start++;
            }
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}