//Time Complexity: O(n)
//Space Compelxity: O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] extra = new int[nums.length];
        extra[0]=1;
        for(int i=1;i<n;i++){
            extra[i]=extra[i-1]*nums[i-1];
            
        }
        int right = nums[n-1];
        nums[n-1]=extra[n-1];
        for(int i=n-2;i>=0;i--){
            int temp = nums[i];
            nums[i]=right*extra[i];
            right*=temp;
        }
        return nums;
    }
}