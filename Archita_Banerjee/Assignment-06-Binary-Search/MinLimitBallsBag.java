public class MinLimitBallsBag {
    public int minimumSize(int[] nums, int maxOperations) {
        int min=1;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max= Math.max(max, nums[i]);
        }
        while(min<=max){
            int mid = (min+max)/2;
            if(isPossible(nums, mid, maxOperations)){
                max= mid-1;
            }else{
                min=mid+1;
            }
        }
        return min;
    }
    public static boolean isPossible(int nums[], int mid, int maxOpr){
        for(int num:nums){
            maxOpr-= (num-1)/mid;
        }
        return maxOpr>=0;
    }
}
