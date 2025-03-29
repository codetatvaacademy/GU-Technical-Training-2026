import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TwoSum{
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0;; ++i) {
            int x = nums[i];
            int y = target - x;
            if (m.containsKey(y)) {
                return new int[] {m.get(y), i};
            }
            m.put(x, i);
        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the nums");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the nums array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the vlaue of target");
        int target = sc.nextInt();
        System.out.println("The resultant array is: " + Arrays.toString(twoSum(nums, target)));
    }
}

//time complexity of the function is: O(n)
//space complexity of the function is: O(n)

//time complexity of the function is: O(n)
//space complexity of the function is: O(n)