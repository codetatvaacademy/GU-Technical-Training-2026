import java.util.Scanner;

public class SortArrayByParity {
        public int[] sortArrayByParity(int[] nums) {
            int s=0, e=0;
            while(e<nums.length){
              if(nums[e]%2==0){
                swap(nums,s,e);
                s++;
              }
              e++;
            }
            return nums;
        }
        public void swap(int nums[], int i,int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j++;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int nums[] = new int[n];
            for(int i=0;i<nums.length;i++){
                nums[i] = sc.nextInt();
            }
            SortArrayByParity sp = new SortArrayByParity();
            int result[] = sp.sortArrayByParity(nums);
            for(int i=0;i<nums.length;i++){
                System.out.print(result[i]+" ");
            }
        }
}
