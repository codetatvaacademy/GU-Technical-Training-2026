import java.util.Scanner;

public class RemoveDuplicatesSortedArrayII {
    
        public int removeDuplicates(int[] nums) {
            int j=2;
            for(int i=2;i<nums.length;i++){
                if(nums[i]!= nums[j-2]){
                    nums[j] = nums[i];
                    j++;
                }
            }
            return j;
        }   
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int nums[] = new int[n];
     for(int i=0;i<nums.length;i++){
        nums[i] = sc.nextInt();
     }
     RemoveDuplicatesSortedArrayII ed = new RemoveDuplicatesSortedArrayII();
     System.out.println(ed.removeDuplicates(nums));
    }
}
