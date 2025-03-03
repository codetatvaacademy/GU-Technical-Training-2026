import java.util.Scanner;

public class PivotIndex {
        public int pivotIndex(int[] nums) {
            int totalSum=0;
            int leftSum=0;
            for(int i=0;i<nums.length;i++){
                totalSum+=nums[i];
            }
            for(int i=0;i<nums.length;i++){
               if(leftSum==totalSum-leftSum-nums[i])
               return i;
               leftSum+=nums[i];
            }
           return -1;
        }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        PivotIndex pi = new PivotIndex();
        System.out.println(pi.pivotIndex(nums)); 
    }
}
