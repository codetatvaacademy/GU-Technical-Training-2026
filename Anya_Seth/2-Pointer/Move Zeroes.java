// class Solution {
//     public int[] moveZeroes(int[] nums) {
//         int count = 0;
//         for(int i = 0 ; i < nums.length ; i++){
//             if(nums[i] == 0){
//                 count++;
//             }
//         }
//         for(int j = 0 ; j < count ; j++){
//         for(int i = 1 ; i < nums.length ; i++){
//             if(nums[i-1] == 0){
//                 int temp = nums[i-1];
//                 nums[i - 1] = nums[i];
//                 nums[i] = temp;
//             }
//         }
//         }
//         return nums;
//     }
// }

class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i = j + 1 ; j < nums.length ; j++){
            nums[j] = 0;
        }
    }
}
