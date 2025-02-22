import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int lower = s.nextInt();
        System.out.print("Enter upper limit: ");
        int upper = s.nextInt();

        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        s.close();
    }
}
