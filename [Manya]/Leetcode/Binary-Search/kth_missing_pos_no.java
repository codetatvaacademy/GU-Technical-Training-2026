import java.util.Scanner;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int index = 0;
        int current = 1;

        while (count < k) {
            if (index >= arr.length || arr[index] != current) {
                count++;
            } else {
                index++;
            }
            if (count == k) {
                return current;
            }
            current++;
        }
        return -1;
    }

    public void userInput() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        System.out.println(findKthPositive(arr, k));

        scanner.close();
    }
}
