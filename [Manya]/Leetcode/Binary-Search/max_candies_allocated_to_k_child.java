import java.util.*;

class Solution {
    public int maximumCandies(int[] candies, long k) {
        if (Arrays.stream(candies).sum() < k) {
            return 0; 
        }
        
        int left = 1, right = Arrays.stream(candies).max().getAsInt();

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canDistribute(candies, k, mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return right;
    }

    private boolean canDistribute(int[] candies, long k, int mid) {
        long count = 0;
        for (int candy : candies) {
            count += candy / mid;
            if (count >= k) return true;  
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of candy piles: ");
        int n = scanner.nextInt();
        int[] candies = new int[n];

        System.out.println("Enter candy counts:");
        for (int i = 0; i < n; i++) {
            candies[i] = scanner.nextInt();
        }

        System.out.print("Enter number of children (k): ");
        long k = scanner.nextLong();

        Solution sol = new Solution();
        int result = sol.maximumCandies(candies, k);
        System.out.println("Maximum candies per child: " + result);

        scanner.close();
    }
}
