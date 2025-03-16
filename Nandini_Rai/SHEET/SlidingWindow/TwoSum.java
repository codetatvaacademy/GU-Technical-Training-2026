import java.util.Scanner;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            int start=0;
            int end =0;
            while(start<nums.length-1){
             end = start+1;
             while(end<nums.length){
             if(nums[start]+nums[end]==target){
               return new int[]{start,end};
             } 
             end++;
             }
            start++;
            }
            
            return new int[]{-1,-1};
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int nums[] = new int[n];
            for(int i=0;i<nums.length;i++){
                nums[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            TwoSum ts = new TwoSum();
            int ans[] = ts.twoSum(nums, target);
            for(int i=0;i<nums.length;i++){
                System.out.print(ans[i]+" ");
            }
        }
}
