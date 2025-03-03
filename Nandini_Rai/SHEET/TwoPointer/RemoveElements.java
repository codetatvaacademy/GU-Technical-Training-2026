import java.util.Scanner;

public class RemoveElements {
        public int removeElement(int[] nums, int val) {
            int j = 0;
            
           for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]= nums[i];
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
            int val = sc.nextInt();
            RemoveElements er = new RemoveElements();
            System.out.println(er.removeElement(nums, val));
        }
}
