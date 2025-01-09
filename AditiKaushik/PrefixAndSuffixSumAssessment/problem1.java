import java.util.Scanner;

class problem1 {
    public static int seeSaw(int[] weight) {
        int n = weight.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = weight[0];
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + weight[i];
        }

        right[n - 1] = weight[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + weight[i];
        }

        for (int i = 0; i < n; i++) {
            if (left[i] == right[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of villagers: ");
        int n = sc.nextInt();

        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the weight of villager " + (i + 1) + " : ");
            weight[i] = sc.nextInt();
        }

        int middle = seeSaw(weight);
        if (middle >= 0) {
            System.out.println("See-saw balances at index: " + middle);
        } else {
            System.out.println("See-saw cannot be balanced");
        }

        sc.close();
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)
