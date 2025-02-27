import java.util.Scanner;

public class LimitOfBalls {
        public boolean isValid(int nums[], int mid, int maxOperations){
            
            for(int i=0;i<nums.length;i++){
                maxOperations -= (nums[i]-1)/mid;
            }
            return maxOperations >=0;
        }
        public int minimumSize(int[] nums, int maxOperations) {
            int min=1;
            int max =0;
            for(int i=0;i<nums.length;i++){
                max = Math.max(max,nums[i]);
            }
            while(min<=max){
                int mid = (min+max)/2;
                if(isValid(nums,mid,maxOperations)){
                    max = mid-1;
                }else{
                    min = mid+1;
                }
            }
            return min;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int maxOperations = sc.nextInt();

        LimitOfBalls lb = new LimitOfBalls();
        int result = lb.minimumSize(nums, maxOperations);

        System.out.println(result);
    }
}
