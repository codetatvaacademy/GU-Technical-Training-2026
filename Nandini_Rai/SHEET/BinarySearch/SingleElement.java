import java.util.Scanner;

public class SingleElement {
        public int singleNonDuplicate(int[] nums) {
            int min =0;
            int max = nums.length-1;
            while(min<max){
                int mid= (min+max)/2;
                if(mid%2==1){
                    mid--;
                }
                if(nums[mid]==nums[mid+1]){
                    min = mid+2;
                }else{
                   max = mid;
                }
            }
            return nums[min];
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

       SingleElement se = new SingleElement();
        int uniqueElement = se.singleNonDuplicate(nums);
        System.out.println(uniqueElement);
    }
}
