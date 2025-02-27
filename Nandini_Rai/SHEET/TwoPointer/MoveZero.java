import java.util.Scanner;
public class MoveZero {
        public void moveZeroes(int[] nums) {
            int i=0;
            int j=0;
            while(i<nums.length){
                if(nums[i]!=0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
                i++;
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int nums[] = new int[n];
            for(int i=0;i<nums.length;i++){
                nums[i] = sc.nextInt();
            }
            MoveZero mz = new MoveZero();
            mz.moveZeroes(nums);
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
}
