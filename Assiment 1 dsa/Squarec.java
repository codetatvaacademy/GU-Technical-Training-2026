import java.util.*;

public class Squarec {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        double square = Math.pow(num, 2);
        double cube = Math.pow(num, 3);
        System.out.println(square);
        System.out.println(cube);
        scanner.close();
    }
}
