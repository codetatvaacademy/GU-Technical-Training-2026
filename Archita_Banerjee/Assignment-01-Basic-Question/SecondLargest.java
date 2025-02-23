import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        int sl;
        if (num1 > num2 && num1 > num3) {
           sl = Math.max(num2, num3);
        } else if (num2 > num1 && num2 > num3) {
            sl = Math.max(num1, num3);
        } else {
            sl = Math.max(num1, num2);
        }

        System.out.println("The second largest number is: " + sl);

    }
}
