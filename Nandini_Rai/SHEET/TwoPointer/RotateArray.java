import java.util.Scanner;

public class RotateArray {
        public void reverse(int nums[],int i,int j){
            while(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        public void rotate(int[] nums, int k) {
            int i=0;
            int j=nums.length-1;
            int n= nums.length;
            k = k%n;
            reverse(nums,0,n-1);
            reverse(nums,0,k-1);
            reverse(nums,k,n-1);
            
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int nums[] = new int[n];
            for(int i=0;i<nums.length;i++){
                nums[i] = sc.nextInt();
            }
            int k= sc.nextInt();
            RotateArray ra = new RotateArray();
            ra.rotate(nums, k);
        }
}

