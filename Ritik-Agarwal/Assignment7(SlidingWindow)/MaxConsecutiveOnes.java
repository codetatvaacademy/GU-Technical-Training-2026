import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        System.out.println(longestOnes(nums, k));
    }
    private static int longestOnes(int[] nums, int k) {
        int countZero = 0;
        for(int i:nums){
            if(i==0){
                countZero++;
            }
        }
        if(countZero<=k){
            return nums.length;
        }

        int ans = 0;
        int start = 0;
        int end = 0;
        int zero = 0;
        while(end<(nums.length)){
            if(nums[end]==0){
                zero++;
            }
            while(zero>k){
                if(nums[start]==0){
                    zero--;
                }
                start++;
            }
            if(zero==k){
                ans = Math.max(ans, end-start+1);
            }
            end++;
        }
        return ans;
    }
}