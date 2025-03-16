import java.util.*;

class Solution {
    public int arrangeCoins(int n) {
        long left = 0, right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sum = (mid * (mid + 1)) / 2;

            if (sum == n) {
                return (int) mid;
            } else if (sum < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) right;
    }

    public void userInput() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(arrangeCoins(n));
        scanner.close();
    }
}
