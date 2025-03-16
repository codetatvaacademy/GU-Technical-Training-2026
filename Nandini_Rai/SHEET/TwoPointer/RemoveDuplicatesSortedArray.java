import java.util.Scanner;

public class RemoveDuplicatesSortedArray {
        public int removeDuplicates(int[] nums) {
            if(nums == null || nums.length ==0) return 0;
           int i=0;
           int j=1;
           while(j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
           j++;
           }
           return i+1;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        RemoveDuplicatesSortedArray rs = new RemoveDuplicatesSortedArray();
        System.out.println(rs.removeDuplicates(nums));
    }
}
