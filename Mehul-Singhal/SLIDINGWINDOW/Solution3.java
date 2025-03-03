import java.util.Scanner;

public class Solution3 {
        public int numberOfSubarrays(int[] nums, int k) {
            int res = 0, count = 0;
            for (int l = 0, r = 0; r < nums.length; r++){
                if (nums[r] % 2 == 1){
                    k--;
                    count = 0;
                }
                while (k == 0){
                    count++;
                    k += (nums[l++] % 2);
                }
                res += count;
            }
            return res;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array:");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter the elements of array: ");
            for(int i =0; i<n ;i++){
                nums[i] =sc.nextInt();
            }
            System.out.println("Enter the value of k");
        int k = sc.nextInt();
        Solution3 solution = new Solution3();
        int result = solution.numberOfSubarrays(nums, k);
        System.out.println("The number of nice subarrays is: " + result);
        sc.close();
        }
    }
    
    
    

