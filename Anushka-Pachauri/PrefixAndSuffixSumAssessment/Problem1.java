import java.util.*;
class Problem1{
    public static int findMiddleIndex(int[] nums){
         int[] prefixSum=new int[nums.length+1];
         int[] suffixSum=new int[nums.length+1];

        prefixSum[0]=0;
        suffixSum[suffixSum.length-1]=0;

        for(int i = 1; i < nums.length+1; i++){
            prefixSum[i] = prefixSum[i-1]+nums[i-1];
        }
        for(int i = suffixSum.length-2;i >= 0; i--){
            suffixSum[i] = suffixSum[i+1]+nums[i];
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(prefixSum[i]==suffixSum[i+1]){
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int[] nums = {2,3,-1,8,4};
        System.out.println("Enter size of nums array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter nums array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int result = findMiddleIndex(nums);
        if(result == -1){
            System.out.println("No index satisfies the balance condition");
        }
        else{
            System.out.println(result);
        }
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n) 
//where n is the length of array nums