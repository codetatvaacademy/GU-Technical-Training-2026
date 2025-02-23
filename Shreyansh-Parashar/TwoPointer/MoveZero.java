import java.util.*;
public class MoveZero {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while(j < nums.length){
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i++] = temp;
                
            }
            j++;
        }
    }
    public static void main(String[] args) {
        MoveZero obj = new MoveZero();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        obj.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
