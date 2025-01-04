import java.util.Scanner;
import java.util.Arrays;
public class problem1 {

    public static int middleIndex(int[] nums)
    {
        int midIndex = 0 ;
        int n = nums.length;
        int[] prefixSum = new int[nums.length];
        int[] suffixSum = new int[nums.length];

        prefixSum[0] = nums[0];
        suffixSum[n-1] = nums[n-1];

        for(int i = 1;i<nums.length;i++){
            prefixSum[i] = nums[i-1] + nums[i];
        }
        // time complixity = O(N)
        //Space Complixity = O(1)

        for(int i = n-2; i >=0;i--){        
            suffixSum[i] = suffixSum[i] + suffixSum[i+1];
        }
        //time Complixity = O(N)
        //Space Complixity = O(1)
        for(int i = 0; i<n ;i++){
            if(prefixSum[i] == suffixSum[i]){
                midIndex += i;
            }else{
                return -1;
            }
            
        }
        //Time Complixity = O(N)
        //Space Complixity = O(1)
        return midIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        problem1 obj = new problem1();
        int[] nums = {2,5};
        int midIndex = obj.middleIndex(nums);
        System.out.println(midIndex);
        
        
    }
}
