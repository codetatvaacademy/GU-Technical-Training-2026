import java.util.Scanner;

public class CountNiceSubarryas {
        public int atMost(int nums[], int k) {
            int end = 0;
            int start = 0;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[end] % 2 == 1)
                    k--;
                while (k < 0) {
                    if (nums[start]% 2 == 1)
                        k++;
                    start++;
                }
                count += (end - start + 1);
                end++;
            }
            return count;
        }
    
        public int numberOfSubarrays(int[] nums, int k) {
            return atMost(nums, k) - atMost(nums, k - 1);
        }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
           nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
       
       CountNiceSubarryas cn = new CountNiceSubarryas();
        System.out.println(cn.numberOfSubarrays(nums,k));
       }
}
