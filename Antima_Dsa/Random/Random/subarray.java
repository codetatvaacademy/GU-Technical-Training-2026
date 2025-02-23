import java.util.HashMap;

public class BinarySubarraySum {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        // HashMap to store prefix sums and their frequencies
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // Initialize with prefix sum 0 having frequency 1

        int prefixSum = 0; 
        int result = 0;    
        for (int num : nums) {
            prefixSum += num; // Update prefix sum

            // Check if (prefixSum - goal) exists in the HashMap
            if (prefixSumCount.containsKey(prefixSum - goal)) {
                result += prefixSumCount.get(prefixSum - goal);
            }

            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums, goal)); // Output: 4
    }
}
