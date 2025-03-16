import java.util.Scanner;
public class DiffernceAnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 >= 0 && num2 >= 0) {
            int difference = num1 - num2;
            System.out.println("The difference is: " + difference);
        }
    }
}
