import java.util.Scanner;

public class ProductExceptItself {
        public int[] productExceptSelf(int[] nums) {
            int ans[] = new int[nums.length];
            int preProduct =1;
            for(int i=0;i<nums.length;i++){
                ans[i] = preProduct;
                preProduct *=nums[i];
            }
            int sufProduct=1;
            for(int i=nums.length-1;i>=0;i--){
                ans[i] *= sufProduct;
                sufProduct *= nums[i];
            }
            return ans;
        }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
       ProductExceptItself pa = new ProductExceptItself();
        int result[] = pa.productExceptSelf(nums);
        for(int i=0;i<nums.length;i++){
           System.out.print(result[i]+" ");
        }
    }
}
