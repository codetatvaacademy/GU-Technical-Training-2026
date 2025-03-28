import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class ContainsDuplicateII{
     public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
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
        System.out.println("Enter the vlaue of k");
        int k = sc.nextInt();
        System.out.println("The result is: " + containsNearbyDuplicate(nums, k));
    }
}

//time complexity of the function is: O(n)
//space complexity of the function is: O(n)

//time complexity of the function is: O(n)
//space complexity of the function is: O(n)