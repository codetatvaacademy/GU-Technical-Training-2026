import java.util.*;
public class NiceSubarrays {
        private int atMost(int[] nums, int k){
            int start = 0;
            int end = 0;
            int answer = 0;
    
            while(end < nums.length){
                k -= nums[end] % 2;
    
                while(k<0){
                    k += nums[start] % 2;
                    ++start;
                }
                answer += end - start + 1;
                ++end;
            }
    
            return answer;
    
        }
        public int numberOfSubarrays(int[] nums, int k) {
            return atMost(nums, k) - atMost(nums, k-1);
        }

        public static void main(String[] args) {
            NiceSubarrays obj = new NiceSubarrays();
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter of size of subString (k) : ");
            int k = sc.nextInt();

            System.out.print("Enter the length of nums: ");
            int n = sc.nextInt();
            System.out.println("Enter the nums: ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }

            int answer = obj.numberOfSubarrays(nums,k);
            System.out.print("Answer: "+ answer);
            sc.close();
        }
    
}
