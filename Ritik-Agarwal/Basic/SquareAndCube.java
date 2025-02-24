import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println("Square of " + a + " is: " + a*a);
        System.out.println("Cube of " + a + " is: " + a*a*a);
    }
}
