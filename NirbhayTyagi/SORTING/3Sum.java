import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ThreeSum{
    public static List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> ans = new ArrayList<>();
            int n = nums.length;
            for (int i = 0; i < n - 2 && nums[i] <= 0; ++i) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int j = i + 1, k = n - 1;
                while (j < k) {
                    int x = nums[i] + nums[j] + nums[k];
                    if (x < 0) {
                        ++j;
                    } else if (x > 0) {
                        --k;
                    } else {
                        ans.add(List.of(nums[i], nums[j++], nums[k--]));
                        while (j < k && nums[j] == nums[j - 1]) {
                            ++j;
                        }
                        while (j < k && nums[k] == nums[k + 1]) {
                            --k;
                        }
                    }
                }
            }
            return ans;
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements of the array:");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter the elements of the array:");
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();            
            }
            System.out.println("the triplets are:" + threeSum(nums));
    }
}