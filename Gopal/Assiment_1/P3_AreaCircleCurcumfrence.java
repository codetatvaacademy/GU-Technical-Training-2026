import java.util.Scanner;

public class P3_AreaCircleCurcumfrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        int r = sc.nextInt();

        // Calculating Area of circle by using formlua pi * r * r
        double area = 3.17 * r * r ;
        System.out.print("Area is :: " + area);
        System.out.println();

        // Calculating Circumference of circle by using formula 2 * pi * r
        double Circumference = 2 * 3.14 * r ;
        System.out.print("Circumference is :: " + Circumference);
    }
}
