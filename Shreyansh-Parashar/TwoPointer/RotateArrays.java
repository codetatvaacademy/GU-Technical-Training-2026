import java.util.*;
public class RotateArrays{
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length-1);
    
    }
    public void reverseArray(int[] nums, int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        RotateArrays obj = new RotateArrays();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        
        obj.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}