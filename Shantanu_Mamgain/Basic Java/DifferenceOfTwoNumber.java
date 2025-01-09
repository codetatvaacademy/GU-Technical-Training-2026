import java.util.Scanner;

public class DifferenceOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        if(number1>number2){
            System.out.println("Difference between the two numbers is: "+(number1-number2));
        }
        else{
            System.out.println("Difference between the two numbers is: "+(number2-number1));
        }

    sc.close();
    }
}
