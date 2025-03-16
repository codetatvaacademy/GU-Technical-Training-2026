import java.util.Scanner;

public class ProductOfArray {
    public static int[] productExceptSelf(int[] nums) {
            int[] answer=new int[nums.length];
            int[] left=new int[nums.length];
            int[] right=new int[nums.length];
            left[0]=1;
            right[right.length-1]=1;
             for(int i=1;i<left.length;i++){
                left[i]=left[i-1]*nums[i-1];
            }
            for(int i=right.length-2;i>=0;i--){
                right[i]=right[i+1]*nums[i+1];
            }
            for(int i=0;i<nums.length;i++){
                answer[i]=left[i]*right[i];
            }
            return answer;
        }
        public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the size of Array:");
         int n=sc.nextInt();
         int[] nums=new int[n];
         System.out.print("Enter the element of Array:");
         for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
         }   
         int[] result=new int[n];
         result=productExceptSelf(nums);
         for(int i=0;i<n;i++){
             System.out.print(" "+result[i]);
         }
         sc.close();
    }
}
