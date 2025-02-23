class SumOfAbsoluteDifferenceInASortedArray {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int totalSum=0;
        int[] answer=new int[nums.length];
        for(int num : nums){
            totalSum+=num;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            int rightSum=totalSum-leftSum-nums[i];
            answer[i]=(nums[i]*i-leftSum)+(rightSum-nums[i]*(nums.length-1-i));
            leftSum+=nums[i];
        }
        return answer;
    }
}