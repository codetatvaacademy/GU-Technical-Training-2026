import java.util.Scanner;

public class MinSwapsGroupAllOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(minSwaps(nums));
    }
    private static int minSwaps(int[] nums) {
        int e=0, s=0, totalOnes=0, ones=nums[0];
        for(int n : nums){
            if(n==1){
                totalOnes++;
            }
        }
        int ans = totalOnes;

        while(s<nums.length){
            if(s!=0){
                ones-=nums[s-1];
            }
            while(e-s+1<totalOnes){
                e++;
                ones+=nums[e%nums.length];
            }
            ans = Math.min(ans, totalOnes-ones);
            s++;
        }
        return ans;
    }
}
