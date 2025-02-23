import java.util.Scanner;
public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int l = sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int up = sc.nextInt();

        System.out.println("Even numbers between " + l + " and " + up + " are:");
        for (int i = l+ 1; i < up; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
