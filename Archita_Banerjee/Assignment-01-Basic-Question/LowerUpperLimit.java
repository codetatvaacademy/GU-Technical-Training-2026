import java.util.Scanner;
public class LowerUpperLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int l = sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int up = sc.nextInt();

        System.out.println("Numbers between " + l + " and " + up + " are:");
        for (int i = l + 1; i < up; i++) {
            System.out.println(i);
        }

    }
}
