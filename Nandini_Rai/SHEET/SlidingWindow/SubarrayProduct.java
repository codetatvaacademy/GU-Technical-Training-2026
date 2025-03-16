import java.util.Scanner;

public class SubarrayProduct {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            if(k<=1) return 0;
            int start=0;
            int count=0;
            int product=1;
           for(int i=0;i<nums.length;i++){
            product *= nums[i];
            while(product>=k && start<=i){
                product/= nums[start];
                start++;
            }
            count += (i-start+1);
           }
           return count;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
           nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        SubarrayProduct sp = new SubarrayProduct();
        System.out.println(sp.numSubarrayProductLessThanK(nums, k));
       }
}
