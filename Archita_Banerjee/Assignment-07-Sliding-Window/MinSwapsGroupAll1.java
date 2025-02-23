public class MinSwapsGroupAll1 {
    public int minSwaps(int[] nums) {
        int start=0;
        int currZero=0;
        int k=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                k++;
            }
        }
        if (k == 0 || k == n) {
            return 0;
        }
        for(int i=0;i<k;i++){
            if(nums[i]==0){
                currZero++;
            }
        }
        int minZero=currZero;
        int end=k-1;
        while(start<n){
            if(nums[start]==0){
                currZero--;
            }
            start++;
            end++;
            if(nums[end % n]==0){
                currZero++;
            }
            minZero= Math.min(minZero, currZero);
        }
        return minZero;
    }
}
