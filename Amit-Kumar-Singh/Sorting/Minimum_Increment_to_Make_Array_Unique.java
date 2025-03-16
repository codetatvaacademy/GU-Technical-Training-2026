class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int moves = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
        }
        int[] frequency = new int[max+n];
        for(int i=0;i<n;i++){
            frequency[nums[i]]++;
        }
        //System.out.println(Arrays.toString(frequency));
        for(int i=0;i<frequency.length-1;i++){
            if(frequency[i]>1){
                moves += frequency[i]-1;
                frequency[i+1] += frequency[i]-1;
            }
        }
        return moves;
    }
}