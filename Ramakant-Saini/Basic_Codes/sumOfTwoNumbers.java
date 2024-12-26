import java.util.Scanner;
public class sumOfTwoNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first Number : ");
        float num1=sc.nextFloat();
        System.out.print("Enter your Second Number : ");
        float num2 = sc.nextFloat();
        float sum=num1 + num2;
        System.out.println("Sum of Two Numbers : " + sum);
    }
}