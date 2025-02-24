import java.util.Scanner;

public class limit {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Lower Limit");
        int a = sc.nextInt();
        System.out.println("Enter your Upper Limit");
        int b = sc.nextInt();
        System.out.println("Numbers in the Between The Limit ");
        for (int i = a + 1; i <= b - 1; i++) {
            System.out.print(i + ",");
        }

    }
}
