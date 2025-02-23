//Time Complexity: O(n)
//Space Complexity: O(n)
class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int [] pre_sum = nums.clone();
        int [] res = new int[n];
        for(int i=1;i<n;i++){
            pre_sum[i]+=pre_sum[i-1];
        }
        res[0]=pre_sum[n-1]-nums[0]*n;
        for(int j=1;j<n;j++){
            res[j]=(nums[j]*j)-(pre_sum[j-1])+(pre_sum[n-1] - pre_sum[j]) - (nums[j]*(n-1-j));
        }
        return res;
    }
}