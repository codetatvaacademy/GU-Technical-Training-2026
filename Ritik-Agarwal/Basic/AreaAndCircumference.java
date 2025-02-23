import java.util.Scanner;

public class AreaAndCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        float area = 3.14F*radius*radius;
        float circumference = 2*3.14F*radius;
        sc.close();
        System.out.println("Area of circle is: " + area);
        System.out.println("Circumference of circle is: " + circumference);
    }
}