import java.util.Scanner;

public class SmallestDivisor {
        public boolean isPossible(int nums[],int mid, int threshold){
            for(int i=0;i<nums.length;i++){
                threshold -= nums[i]/mid;
               if(nums[i]%mid!=0){
                threshold--;
               }
            }
            
            return threshold >=0;
        }
        public int smallestDivisor(int[] nums, int threshold) {
            int min =1;
            int max =0;
            for(int i=0;i<nums.length;i++){
             max = Math.max(max,nums[i]);
            }
            
            while(min<=max){
                int mid = (min +max)/2;
                if(isPossible(nums,mid,threshold)){
                    max = mid-1;
                }
                else{
                    min = mid+1;
                }
            }
            return min;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int threshold = sc.nextInt();

       SmallestDivisor sd = new SmallestDivisor();
        int result = sd.smallestDivisor(nums, threshold);
        
        System.out.println(result);
    }
}
