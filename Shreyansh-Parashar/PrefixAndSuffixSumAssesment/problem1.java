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
        

        for(int i = 1;i<nums.length;i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        // time complixity = O(N)
        //Space Complixity = O(1)

        suffixSum[n-1] = nums[n-1];

        for(int i = n-2; i >=0;i--){        
            suffixSum[i] = nums[i] + suffixSum[i+1];
        }
        //time Complixity = O(N)
        //Space Complixity = O(1)
        for(int i = 0; i<n ;i++){
            if(prefixSum[i] == suffixSum[i]){
                return i;
            }
            
            
        }
        //Time Complixity = O(N)
        //Space Complixity = O(1)
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        problem1 obj = new problem1();


        System.out.println("Enter the number of element in Array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the element in Arrays: ");
        for(int i = 0; i < n;i++){
            nums[i] = sc.nextInt();
        }

        int midIndex = obj.middleIndex(nums);
        System.out.println(midIndex);
    }
}
