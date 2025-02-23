import java.util.*;

public class MaximumSumObtainedofAnyPermutation {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        int[] newNums = new int[nums.length];
        int n = requests.length; 
        int end = 0;
        while(end < n){
             newNums[requests[end][0]]++;
             if(requests[end][1] + 1 < nums.length){
                 newNums[requests[end][1] + 1]--;
             }
             end++;
        }
        for(int i = 1; i < newNums.length; i++){
             newNums[i] = newNums[i] + newNums[i-1];
        }
        Arrays.sort(newNums);
        Arrays.sort(nums);
 
         long ans = 0;
         for(int i = 0; i < newNums.length; i++){
             ans += 1L*newNums[i] * nums[i];
         }
        return (int)(ans % 1_000_000_007);  
    }
    public static void main(String[] args) {
        MaximumSumObtainedofAnyPermutation obj = new MaximumSumObtainedofAnyPermutation();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int p = sc.nextInt();
        

        int[][] requests = new int[p][2];
        for(int i = 0; i < p; i++){
            
            requests[p][0] = sc.nextInt();
            requests[p][1] = sc.nextInt();
            
        }

        int ans = obj.maxSumRangeQuery(nums, requests);
        System.out.println(ans);
    }
}
