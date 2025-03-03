import java.util.*;
public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int product = 1;
        int answer = 0;

        while(end < nums.length){
            product *= nums[end];

            while(start <= end && product >= k){
                product /= nums[start++];
            }
            answer += end - start +1;
            ++end;
        }
        return answer;
    }
    public static void main(String[] args) {
        SubarrayProductLessThanK obj = new SubarrayProductLessThanK();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of nums: ");
        int n = sc.nextInt();

        System.out.println("Enter the nums(Arrays): ");
        int[] nums = new int[n];

        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the k(size of subString) : ");
        int k = sc.nextInt();

        int answer = obj.numSubarrayProductLessThanK(nums, k);
        System.out.println(answer);
    }
}
