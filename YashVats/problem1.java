@ -0,0 +1,39 @@
import java.util.Scanner;

class MiddleIndex {
    public void leftMostIndex(int[] weights) {
        int totalSum = 0;
        int leftSum = 0;

     for (int weight : weights) {
            totalSum += weight;
        }

     for (int i = 0; i < weights.length; i++) {
            int rightSum = totalSum - leftSum - weights[i];
            
            if (leftSum == rightSum) {
                System.out.println("The leftmost index is: " + i);
                return;
            }
            leftSum += weights[i];
        }
    System.out.println(-1);
    }
}

class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] weights = new int[n];
        System.out.print("Enter the weights of the villagers: ");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        MiddleIndex obj = new MiddleIndex();
        obj.leftMostIndex(weights);
    }
}