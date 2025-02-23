import java.util.Scanner;
public class AverageEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenSum = 0, oddSum = 0;
        int evenCount = 0, oddCount = 0;
        int number;

        System.out.println("Enter numbers (Press -1 to stop):");

        while (true) {
            number = sc.nextInt();

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                evenSum += number;
                evenCount++;
            } else {
                oddSum += number;
                oddCount++;
            }
        }
        double evenAvg = (evenCount == 0) ? 0 : (double) evenSum / evenCount;
        double oddAvg = (oddCount == 0) ? 0 : (double) oddSum / oddCount;

        System.out.println("Average of even numbers: " + evenAvg);
        System.out.println("Average of odd numbers: " + oddAvg);

    }
}
