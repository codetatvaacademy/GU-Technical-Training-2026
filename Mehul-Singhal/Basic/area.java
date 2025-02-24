import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();// r = radius
        double pi = 3.14;
        sc.close();
        System.out.println("Area: " + (pi * r * r)); 
        System.out.println("Circumference: " + (2 * pi * r));
    }
}
